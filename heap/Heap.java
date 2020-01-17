class Heap <T> {
  // Instead of indexes we use keys
  private class Node<T> {
    int key;
    T data;

    Node(int k, T d) {
      key = k;
      data = d;
    }

    int getKey() { return key; }
    T getData() { return data; }
    void setKey(int k) { key = k; }
    void setData(T d) { data = d; }
    public String toString() { return (key + " " + data.toString()); } 
  }

  private Node heap[];
  private int size;

  public Heap() {
    heap = new Node[1000];
		size = 0;
  }

  public Heap(int S) {
    heap = new Node[s];
    size = 0;
  }

  public boolean isEmpty() {
    return (size == 0);
  }

  public void resize(int newSize) {
    if(s < heap.length)
      return;
    System.out.println("Old capacity: " + heap.length + "\n New Capacity: " + s);
    
    // Create a new array with newSize
    Node newHeap[] = new Node[newSize];

    // Copy exisiting elements to the new array
    for(int i = 0; i < size; i++) {
      newHeap[i] = heap[i];
    }

    //Change the existing array to the new one
    heap = newHeap;
  }

  public void add(int k, T element) {
    // If the current capacity is reached then resize to increase size by 100
    if(size == heap.length) {
      this.resize(heap.length + 100);
      System.out.println("Heap resized");
    }

    Node newNode = new Node(k, element);

    // Store the new node at the end of the array (Size)
    heap[size] = newNode;
    size++;
    heapify(size-1);
  }

  // Randomizes code?
  private void heapify(int index) {
    if(index == 0)
      return;
    
    if(heap[(index-1)/2].getKey() > heap[index].getKey())
      return;

    // Swap index and (index-1)/2
    Node temp = new Node(heap[index].getKey(), heap[index].getData());

    heap[index].setKey(heap[(index-1)/2].getKey());
    heap[index].setData(heap[(index-1)/2].getData());

    // Change the parent
    heap[(index - 1)/2].setKey(temp.getKey());
    heap[(index - 1)/2].setData(temp.getData());
    heapify((index-1)/2);
  }

  private void swap(int swap, int other) {
    Node temp = new Node(heap[swap].getKey(), heap[swap].getData());

    // Change the child
    heap[swap].setKey(heap[other].getKey());
    heap[swap].setData(heap[other].getData());

    // Change the parent here
    heap[other].setKey(temp.getKey());
    heap[other].setData(temp.getData());
  }

  private void reheapify(int index) {
    // If the left child does not exist then this is a leaf
    if(2 * index + 1 >= size) {
      return;
    }

    // Check if the right child exists
    if(2 * index + 2 < size) {
      // Compare with the max of two
    }
  }

  public T remove(int index) {
    if(isEmpty()) {
      return null;
    }
    
    T temp = heap[0].getData();

    if(this.size == 1) {
      size = 0;
      return temp;
    }

  }

  public String toString() {
    if(isEmpty()) {
      return "[]";
    }
    
    String str = "[";
    // Add all elements except the last one
    for(int i = 0; i < size-1; i++) {
      str = str + heap[i].getData() + ", ";
    }

    // Add the last element
    str =  str + heap[size-1].getData() + "]";

    return str;
  }

  public void print() {
    System.out.println(this.toString());
  }
}