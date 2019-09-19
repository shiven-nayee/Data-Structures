public class Tester {
  public static void main(String[] args) {
    Stack<Integer> ogStack = new Stack<Integer>(50);

    ogStack.push(11);
    ogStack.push(-12);
    ogStack.push(3);
    ogStack.push(-6);
    ogStack.push(-9);
    ogStack.push(4);
    ogStack.push(5);
    ogStack.push(-10);

    Stack<Integer> negativeStack = new Stack<Integer>();
    Stack<Integer> positiveStack = new Stack<Integer>();

    int stackSize = ogStack.getSize();
    while(stackSize > 0) {
      int currentTop = ogStack.pop();
      if(currentTop < 0)
        negativeStack.push(currentTop);
      else
        positiveStack.push(currentTop);
      stackSize--;
    }

    int negativeStackSize = negativeStack.getSize();
    while(negativeStackSize > 0) {
      int currentTop = negativeStack.pop();
      ogStack.push(currentTop);
      negativeStackSize--;
    }

    int positiveStackSize = positiveStack.getSize();
    while(positiveStackSize > 0) {
      int currentTop = positiveStack.pop();
      ogStack.push(currentTop);
      positiveStackSize--;
    }
    
    ogStack.displayStack();
    }
  }