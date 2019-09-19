public class Queue <T>{
  private T[] Arr;
  private int size;

  // The Default constructor that initialize the array to 100
  public Queue() {
    Arr = (T[]) new Object[100]; 
  }

  // The constructor that initialize the array to size "s"
  public Queue(int s) {
    Arr = (T[]) new Object[s]; 
  }

  // A method that return the size of the Queue
  public int size() {
    return size;
  }

  // isEmpty return if empty or not
  public boolean isEmpty() {
    if(size == 0)
      return true;
    else 
      return false;
  }

  // A method that adds to the top of the Queue
  public void add(T element) {
    if(size == Arr.length) 
      resize();

    Arr[size] = element;
    size++;
  }

  // Extends the array by 100
  public void resize() {
    if(size < Arr.length)
      return;

    T[] newArr = (T[]) new Object[size + 100];
    for(int i = 0; i < Arr.length; i++) {
      newArr[i] = Arr[i];
    }

    Arr = newArr;
  }

  // Removes the first element in the Queue and moves each element down by 1
  public T remove() {
    if(isEmpty()) {
      System.out.println("Queue is Empty");
      return (T)"{}";
    } 
    T temp = Arr[0];
    for(int i = 1; i < size; i++) {
      Arr[i-1] = Arr[i]; 
    }
    size--;
    return temp;
  }

  // Shows the first element without removing it
  public T peek() {
    if(isEmpty()) {
      System.out.println("Queue is Empty");
      return (T) "{}";
    }
    return Arr[0];
  }

  public void displayQueue() {
    String str = "{";
    if(isEmpty()) {
      System.out.println("{}");
      return;
    }
    for(int i = 0; i < size; i++) {
      if(i == size-1)
        str = str + Arr[i] + "}";
      else 
        str = str + Arr[i] + ", ";
    }
    System.out.println(str);
  }

}