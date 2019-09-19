public class Stack <T> {
  private T[] Arr;
  private int size;

  // The default constructor create an Object with a size of 100
  public Stack() {
    Arr = (T[]) new Object[200];
    size = 0;
  }

  // A constuctor that creates an Object of size S
  public Stack(int s) {
    Arr = (T[]) new Object[s];
    size = 0;
  }

  // A method returning the size of the stack 
  public int getSize() {
    return size;
  }

  public void resize() {
    if(size < Arr.length)
      return;

    T[] newArr = (T[]) new Object[size + 100];
    for(int i = 0; i < Arr.length; i++) {
      newArr[i] = Arr[i];
    }

    Arr = newArr;
  }

  // Adds an element to the top of the stack
  public void push(T element) {
    if(Arr.length == size)
      resize();

    Arr[size] = element;
    size++;
  }

  // Removes the top and returns it
  public T pop() {
    if(isEmpty())
      return null;

    size--;
    return Arr[size];
  }

  // Returns the top without removing it
  public T peak() {
    if(isEmpty())
      return null;

    return Arr[size-1];
  }

  // Returns whether the Array is empty of not
  public boolean isEmpty() {
    if(size == 0) 
      return true;

    return false;
  }

  // Displays the stack
  public void displayStack() {
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