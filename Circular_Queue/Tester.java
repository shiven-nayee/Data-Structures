public class Tester {
  public static void main(String[] args) {
    CircularQueue<Integer> myQueue = new CircularQueue<Integer>(5);

    myQueue.add(1);
    myQueue.add(2);
    myQueue.add(3);
    myQueue.add(4);
    myQueue.add(5);
    myQueue.remove();
    myQueue.remove();

    myQueue.displayQueue();
  }
}