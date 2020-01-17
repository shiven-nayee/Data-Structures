class Tester {
  public static void main(String[] args) {
    Heap<String> myHeap = new Heap();
    myHeap.add(13, "Thirteen");
    myHeap.add(1, "One");
    myHeap.add(5, "Five");
    myHeap.add(9, "Nice");
    myHeap.add(4, "Four");
    myHeap.print();
  };
}