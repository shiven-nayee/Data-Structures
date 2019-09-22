public class Tester {
  public static void main(String[] args) {
    Queue<Integer> myQueue = new Queue<Integer>(5);
    

    // Test whether the remove works on an Empty Queue
    myQueue.remove();
    
    // Populate the Queue as well as check if resize() works
    myQueue.add(11);
    myQueue.add(-12);
    myQueue.add(3);
    myQueue.add(-6);
    myQueue.add(-9);
    myQueue.add(4);
    myQueue.add(5);
    myQueue.add(-10);
    
    myQueue.displayQueue();
    
    /*
     * Arranging the que in order of negative numbers
     * then positive numbers using only 1 additional queue.
     * Get the size of the queue outside of the loop otherwise
     * the size of the queue will constantly change interfereing
     * with the for loop
     */
    int s = myQueue.size();
    Queue<Integer> newQueue = new Queue<Integer>(5);
    for(int i = 0; i < s + 2; i++) {
      int num = myQueue.remove();
      System.out.println(num);
      if(num < 0) {
        newQueue.add(num);
      } else {
        myQueue.add(num);
      }
    }

    s = myQueue.size();
    for(int i = 0; i < s; i++) {
      newQueue.add(myQueue.remove());
    }

    newQueue.displayQueue();
  }
}