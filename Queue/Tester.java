public class Tester {
  public static void main(String[] args) {
    Queue<Integer> myQueue = new Queue<Integer>(5);

    // Test whether the remove works on an Empty Queue
    myQueue.remove();
    
    // Populate the Queue as well as check if resize() works
    myQueue.add(1);
    myQueue.add(2);
    myQueue.add(3);
    myQueue.add(4);
    myQueue.add(5);
    myQueue.add(6);
    myQueue.add(7);

    // Test whether peek() works
    System.out.println(myQueue.peek());

    myQueue.remove();

    myQueue.displayQueue();
  }
}