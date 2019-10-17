public class Tester {
  public static void main(String[] args){
    /*
    * Create an object ourList of strings
    * 1. Add the following strings to the front frisplay the lsit each time you add
    * "Hi, there"
    * "How are you"
    * "Find and you"
    * "How about you"
    * 2. Test addElement at an index function 
    */
    LinkedList<String> list = new LinkedList<String>();
    list.addBack("Hi, there");
    list.addBack("How are you");
    list.addBack("Fine and you");
    list.addBack("How about you");
    list.addBack("Last word");
    list.AddElement("Adding in the middle", 3);
    System.out.println(list.removeBack());
    System.out.println(list.removeFront());
    System.out.println(list.removeElement(3));
    System.out.println(list.removeElement(2));
    System.out.println(list.displayList());
  }
}