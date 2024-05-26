
public class lab_exam{ 
    Node tail; 
    int data;
    
    public void SinglyLinkedList() { 
     tail = null; 
    } 
    
    public void append(int value) { 
     Node newNode = new Node (value); 
     if (tail == null) { 
      tail.next = newNode; 
      newNode.prev = tail;
      return; 
     } 
    
     // otherwise traverse to the end 
     Node current = tail; 
     while (current.prev != null) { 
      current = current.prev; 
     } 
     current.prev = tail; 
    } 
    
    void display() { 
     Node current = tail; 
     while (current != null) { 
      System.out.print(current.data + " "); 
      current = current.next; 
     } 
     System.out.println(); 
    } 
    
    public static void main(String[] args) { 
     SinglyLinkedList list = new SinglyLinkedList(6); 
     list.append(1); 
     list.append(2); 
     list.append(3); 
     list.append(value:4);
     list.append(value:5);
     list.display(); 
    } 
    
   
   
}