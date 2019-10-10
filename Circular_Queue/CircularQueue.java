public class CircularQueue <T>{
  private T Arr[];
  private int size;
  private int head;
  private int tail;

  public CircularQueue() {
    Arr = (T[]) new Object[100];
    size = 0;
    head = -1;
    tail = -1;
  }

  public CircularQueue(int s) {
    Arr = (T[]) new Object[s];
    size = 0;
    head = -1;
    tail = -1;
  }

  public int getSize() {
    return size;
  }

  public boolean isEmpty() {
    if(size == 0)
      return true;
    return false;
  }

  public void add(T element) {
    if(isEmpty()) {
      tail = 0;
      head = 0;
      Arr[tail] = element;
      size++;
      return;
    }
    if(size == Arr.length)
      resize();
    
    tail = (tail + 1)%Arr.length;
    Arr[tail] = element;
    size++;
  }

  public T remove() {
    if(isEmpty()) {
      System.out.println("The Queue is Empty");
      return null;
    }
    T temp = Arr[head];
    head = (head + 1)%Arr.length;
    size--;
    return temp;
  }

  private void resize() {
    // Temporary Array
    T[] temp = (T[]) new Object[Arr.length + 100];
    // Copy Existing array starting at head
    for(int i = 0; i < size; i++) {
      temp[i] = Arr[(head + i)%Arr.length];
    }
    Arr = temp;
  }

  public void peek() {
    if(isEmpty()) {
      System.out.println("The Queue is Empty");
    }
    System.out.println(Arr[head]);
  }

  public void displayQueue() {
    String str = "{";
    if(isEmpty()) {
      System.out.println("{}");
      return;
    }
    for(int i = head; i <= tail; i++) {
      if(i == tail)
        str = str + Arr[i] + "}";
      else
        str = str + Arr[i] + ", ";
    }
    System.out.println(str);
  }
}