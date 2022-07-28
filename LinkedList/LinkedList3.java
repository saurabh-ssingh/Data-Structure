//inserting a node in end of list
public class LinkedList3 {
    static Node  head;
    class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }

    //inserting a node at the end of list
    public void append(int new_data){
        // agar variable null hai to use dusre vairable me store nhi kr skte
        Node temp = head;
        if(head == null){
            head  = new Node(new_data); 
        }else {
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = new Node(new_data);
        }
        
    }

    //printing the list
    public static void printList(){
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        LinkedList3 llist = new LinkedList3();
        llist.append(1);
        llist.append(4);
        llist.append(3);
        llist.append(6);
        printList();
    }
}
