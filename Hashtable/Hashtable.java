import java.math.BigDecimal;

public class Hashtable<O, T> {
  public class Node <O, T> {
    O key;
    T data;
    Node next;

    // public Node() {
    //   key = null;
    //   data = null;
    //   next = null;
    // }

    public Node(O k, T d) {
      key = k;
      data = d;
      next = null;
    }

    O getKey() {
      return key;
    }
    
    T getData() {
      return data;
    }

    Node getNext() {
      return next;
    }
    
    void setKey(O k) {
      key = k;
    }

    void setData(T d) {
      data = d;
    }
    
    void setNext(Node n) {
      next = n;
    }

    public String toString() {
      String str = "(" + key.toString() + ", " + data.toString() + ")"; 
      return str;
    }
  }
  private Node[] table;
  private int size;

  public Hashtable() {
    table = new Node[10];
    size = 0;
  }

  public long HashCode (String str) {
    BigDecimal code = new BigDecimal(0);
    for(int i = 0; i < Math.min(15, str.length()); i++) {
      code = code.add(BigDecimal.valueOf((int)str.charAt(i)* Math.pow(26, i)));
    }
    return code.longValue();
  }

  public void put(O key, T data) {
    // Create a node
    Node newNode = new Node(key, data);

    // Find where to store it
    int index = (int)HashCode(key.toString())%table.length;

    // Check if the index is avaiable
    if(table[index] == null) {
      table[index] = newNode;
      size ++;
      return;
    }

    // If something is already there, Chain it to the end of the existing Node
    Node temp = table[index];
    // Go to the last Node of the existing index
    while(temp.getNext() != null) {
      temp = temp.getNext();
    }
    temp.setNext(newNode); // Once at the last node in the current index append the new node
    size++;
    }

    public Node remove(O k) {
      
      return null;
    }

    public String toString() {
      String str = "{";
      int sizeCheck = 0;
      for(int i = 0; i < table.length; i++) {
        if(table[i] != null) {
          // Check if there is more than one Node at the given index
          if(table[i].getNext() != null) {
            Node temp = table[i];
            String chainNodeStr = "{";
            while(temp != null) {
              // While the 
              if(temp.getNext() !=  null) {
                chainNodeStr += temp.toString() + ", ";
                sizeCheck++;
              } else {
                chainNodeStr += temp.toString();
              }
              temp = temp.getNext();
            }
            if(sizeCheck < size - 1) {
              chainNodeStr += "}, ";
            } else {
              chainNodeStr += "}";
            }
            str += chainNodeStr;
          }
          if(sizeCheck < size-1) {
            str += table[i].toString() + ", ";
            sizeCheck++;
          } else {
            str += table[i].toString() + "}";
          }
        }
      }
      return str;
    }
  }