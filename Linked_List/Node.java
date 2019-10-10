public class Node<T> {
  // Generic private member data
  private T data;

  // Private reference to the next node
  private Node<T> next;

  public Node() {
    data = null;
    next = null;
  }

  // Instansiate a node with an element
  public Node(T element) {
    data = element;
    next = null;
  }

  // Instatiate a node with a element and a nextNode
  public Node(T element, Node nextNode) {
    data = element;
    next = nextNode;
  }

  // Accessors and Mutators
  public T getData() {
		return data;
  }
  
	public Node getNext() {
		return next;
  }
  
	public void setData(T element){
		data = element;
  }
  
	public void setNext(Node nextNode){
		next = nextNode;
	}
	public String toString(){
		String st = "" + data.toString();
		return st;
	}
}