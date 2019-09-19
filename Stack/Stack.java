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
  int getSize() {
    return size;
  }

  void resize() {
    if(size < Arr.length)
      return;

    T[] newArr = (T[]) new Object[size + 100];
    for(int i = 0; i < Arr.length; i++) {
      newArr[i] = Arr[i];
    }

    Arr = newArr;
  }

  // A method push that adds an element to the top
  void push(T element) {
    if(Arr.length == size)
      resize();

    Arr[size] = element;
    size++;
  }

  // A method pop that removes the top and returns it
  T pop() {
    if(isEmpty())
      return null;

    size--;
    return Arr[size];
  }

  // A method peak that returns the top without removing it
  T peak() {
    if(isEmpty())
      return null;

    return Arr[size-1];
  }

  // A method that returns whether the Array is empty of not
  boolean isEmpty() {
    if(size == 0) 
      return true;

    return false;
  }

  // A method to display the stack
  void displayStack() {
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