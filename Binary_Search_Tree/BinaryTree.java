public class BinaryTree <T>{
  private class Node<T> {
    int key;
    T data;
    Node left, right;
    
    Node() {
      key = 0;
      data = null;
      left = right = null;
    }
    
    Node(int k, int d) {
      key = k;
      data = d;
      left = right = null;
    }
    
    int getKey() { return key; }
    T getData() { return data; }
    Node getLeft() { return left; }
    Node getRight() { return right; }
    void setKey(int k) { key = k; }
    void setData(T d) { data = d; }
    void setLeft(Node newNode) { left = newNode; }
    void setRight(Node newNode) { right = newNode; }
  }
  private int size;
  private Node<T> root;
  
  BinaryTree() {
    size = 0;
    root = null;
  }

  public void add(int index, T element) {
    Node newNode = new Node(index, element);
    if(root == null) {
      root = newNode;
      size++;
      return;
    }
    Node temp = root;
    while(true) {
      if(index <= temp.getKey()) {
        if(temp.getLeft() == null) {
          temp.setLeft(newNode);
          size++;
          return;
        } else {
          temp = temp.getLeft();
        }
      } else { // Index > Key 
        if(temp.getRight() == null) {
          temp.setRight(newNode);
          size++;
          return;
        } else {
          temp = temp.getRight();
        }
      }
    }
  }

  public void inOrder() {
    System.out.println("[");
    visit(root);
    System.out.println("]");
  }

  // private Node smallestOnRight() {

  // }

  // private Node largestOnTheLeft(Node n) {

  // }

  public Node ParentOf(Node n) {
    Node temp = root;
    if(temp.getKey() == n.getKey()) {
      return null;
    }
    while(temp != null) {
      if(temp.getLeft() != null && temp.getLeft().getKey() == n.getKey()){
        return temp;
      } else if(temp.getRight() != null && temp.getRight().getKey() == n.getKey()) {
        return temp;
      } else if(temp.getKey() > n.getKey()){ 
        temp = temp.getLeft();
      } else {
        temp = temp.getRight();
      }
    }
    return n;
  }

  public T delete(int k) {
    Node temp = root;
    if(temp.getKey() == k)
      return temp;
    while(temp != null) {

    }
  }

  public void visit(Node n) {
    if(n == null)
      return;
    visit(n.getLeft());
    System.out.println(n.getKey() + ", ");
    visit(n.getRight());
  }
}