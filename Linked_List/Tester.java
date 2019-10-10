public class Tester {
  public static void main(String[] args){
    /*
    * Create an object ourList of strings
    * Add the following strings to the front frisplay the lsit each time you add
    * "Hi, there"
    * "How are you"
    * "Find and you"
    * "How about you"
    */
    LinkedList<String> list = new LinkedList<>();
    list.addBack("Hi, there");
    list.addBack("How are you");
    list.addBack("Find and you");
    list.addBack("How about you");
    System.out.println(list.displayList());
  }
}