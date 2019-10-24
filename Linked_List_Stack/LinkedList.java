public class LinkedList <T> {
  // A private member reference to a Node that the head of the list
  private Node<T> head;
  // A private member reference to a Node that is the Tail of the list
  private Node<T> tail;
  private int size;

  public LinkedList() {
    head = null;
    tail = null;
    size = 0;
  }

  public boolean isEmpty() {
    return (size == 0);
  }
  
  // void addFront (T element): allows to add an element to the front of the list
  public void addFront(T element) {
    if(isEmpty()) {
      head = new Node<T>(element);
      tail = head;
      size++;
      return;
    }
    
    head = new Node<T>(element, head);
    size++;
  }

  // void AddBack (T element): allows to add an element to the back of the list
  public void addBack(T element) {
    Node<T> temp = new Node<T>(element);

    if(isEmpty()) {
      head = temp;
      tail = head;
      size++;
      return;
    }

    tail.setNext(temp);
    tail = temp;
    size++;
  }

  // void AddElement (T element, int ind): adds element to index ind
  public void AddElement(T element, int index) {
    if(index > size || index < 0) {
      System.out.println("Invalid index");
      return;
    } else if (index == 0) {
      addFront(element);
    } else if(index == size) {
      addBack(element);
    }

    Node<T> temp = new Node<T>(element);
    Node<T> currentNode = head;

    for(int i = 1; i < size; i++) {
      if(i == index) {
        temp.setNext(currentNode.getNext());
        currentNode.setNext(temp);
        return;
      }
      currentNode = currentNode.getNext();
    }
  }

  // T removeFront() removes the element at front and returns it
  public T removeFront() {
    if(isEmpty()) {
      return null;
    }
    size--;
    if(size == 0)
      tail = null;
    T temp = head.getData();
    head = head.getNext();
    return temp;
  }

  // T removeBack() removes the element at the back and returns it
  public T removeBack() {
    if(size == 0)
      return null;
    T temp = tail.getData();
    Node<T> tempHead = head;
    for(int i = 0; i < size; i++) {
      if(tempHead.getNext() == tail) {
        tempHead.setNext(null);
        size--;
        if(size == 0)
          tail = tempHead;
        return temp;
      }
      tempHead = tempHead.getNext();
    }
    return temp;
  }

  // T removeElement(int ind) removes element at index ind and returns it
  public T removeElement(int index) {
    if(size == 0)
      return null;
    if(index == size)
      removeBack();
    if(index == 0)
      removeFront();
    Node<T> currentNode = head;
    T temp = currentNode.getData();
    for(int i = 1; i < size; i++) {
      if(i+1 == index) {
        temp = currentNode.getNext().getData();
        currentNode.setNext(currentNode.getNext().getNext());
        size--;
        return temp;
      }
      currentNode = currentNode.getNext();
    }
    return temp;
  }

  public String displayList() {
    if(isEmpty())
      return "{}";
    
    String output = "{";
    Node<T> temp = head;
    while(temp.getNext() != null) {
      output += temp.getData() + " -> ";
      temp = temp.getNext();
    }
    output += temp.getData() + "}";
    return output;
  }
}