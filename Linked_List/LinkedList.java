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
    Node temp = new Node<T>(element);

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

  }

  // T removeFront() removes the element at front and returns it
  public T removeFront() {
    return null;
  }

  // T removeBack() removes the element at the back and returns it
  public T removeBack() {
    return null;
  }

  // T removeElement(int ind) removes element at index ind and returns it
  public T removeElement(int index) {
    return null;
  }

  public String displayList() {
    if(isEmpty())
      return "{}";
    
    String output = "{";
    Node temp = head;
    while(temp != null) {
      output += temp.getData() + " -> ";
      temp = temp.getNext();
    }
    output += "}";
    return output;
  }
}