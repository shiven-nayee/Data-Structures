import java.util.Arrays;

public class ArrayList <T> {
  private T[] arr;

  // An integer size that will keep track of the size of the array 
  private int size;

  public ArrayList() {
    arr = (T[]) new Object[100];
    size = 0;
  }

  public ArrayList(int s) {
    arr = (T[]) new Object[s];
    size = 0;
  }

  int getSize() {
    return size;
  }

  // void AddFront (int e): allows to add an integer to the front of the
  void addFront(T num) {
    if(isEmpty()) {
      arr[0] = num;
    } else if(isFull()) {
      resize();
      for(int i = size-1; i >= 0; i--) {
        T temp = arr[i];
        arr[i+1] = temp;
      }
      arr[0] = num;
    } else {
      for(int i = size-1; i >= 0; i--) {
        T temp = arr[i];
        arr[i+1] = temp;
      }
      arr[0] = num;
    }
    size++;
  }

  // void resize(int s): Resizes the array to double the current size, if the array if full
  void resize() {
    if(s < arr.length) {
      return;
    }

    T[] newArr = (T[]) new Onject[size+100];
    for(int i = 0; i < arr.length; i++) {
      newArr[i] = arr[i];
    }

    arr = newArr;
  }

  void addBack(T num) {
    if(isFull()) {
      resize();
      arr[size] = num;
    } else {
      arr[size] = num;
    }
    size++;
  }

  void addElement(T num, int index) {
    if(index < 0 || index > arr.length) {
      System.out.println("Index is out of bounds");
    } else if(isEmpty()) {
      arr[index] = num;
    } else if(index == size) {
      addBack(num);
    } else if(index == 0) {
      addFront(num);
    } else {
      for(int i = arr.length-2; i >= index; i--) {
        int temp = arr[i];
        arr[i+1] = temp;
        arr[index] = num;
      }
    }
    size++;
  }

  T removeFront() {
    int temp = arr[0];
    arr[0] = 0;
    if(size > 1) {
      for(int i = 1; i < size; i++) {
        arr[i-1] = arr[i];
        arr[i] = 0;
      }
    }
    size--;
    return temp;
  }

  T removeEnd() {
    if(isEmpty()) {
      System.out.println("List is empty");
    }
    int temp = arr[size-1];
    arr[size-1] = 0;
    size--;
    return temp;
  }

  T removeElement(int index) {
    int temp = 0;
    if(index < 0 || index > size) {
      System.out.println("Invalid Index");
      return 0;
    } else if (index == 0) {
      removeFront();
    } else if (index == size) {
      removeEnd();
    } else {
      temp = arr[index];
      for(int i = index+1; i < size; i++) {
        arr[i - 1] =  arr[i];
        arr[i] = 0;
      }
    }
    size--;
    return temp;
  }

  boolean isFull() {
    if(size == arr.length)
      return true;
    else
      return false;
  }

  boolean isEmpty() {
    if(size == 0) 
      return true;
    else
      return false;
  }

  void displayArr() {
    String str = "{";
    for(int i = 0; i < size; i++) {
      if(isEmpty())
        str = "{}";
      if(i == size-1)
        str = str + arr[i] + "}";
      else 
        str = str + arr[i] + ", ";
    }
    System.out.println(str);
  }
}