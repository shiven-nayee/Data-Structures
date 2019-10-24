import java.util.LinkedList;

/*
 * Implement the interface Queue as a wrapper around the LinkedList class 
 * isEmpty, push, pop, getSize, toString, peek
 */

public class LLQueue<T> {
  private LinkedList<T> queue;
  
  public LLQueue() {
    queue = new LinkedList();
  }

  public int getSize() {
    return queue.getSize();
  }

  public boolean isEmpty() {
    return queue.isEmpty();
  }

  public void add(T eleement) {
    queue.addLast(element);
  }
  
  public T remove(){
    return queue.removeFirst();
  }

  public T peek() {
    return queue.peek();
  }

  public String toString() {
    return queue.toString();
  }
}