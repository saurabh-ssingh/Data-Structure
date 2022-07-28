import java.util.HashSet;

// Detect a loop in linked list
// Hashing Approach
public class LinkedList10{
    static Node head;
    public class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }
    }

    // Insert node at front of list
    public void push(int new_data){
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    //print list
    public static void printList(){
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.data+" ");
            temp = temp.next;

        }
    }
    //return true if there is loop in list else false
    public static boolean detectLoop(Node h){
        //HashSet<Node> s = new HashSet<Node>();
        HashSet<Node> s = new HashSet<Node>();
        while(h != null){
            if(s.contains(h)){
                return true;
            }
            s.add(h);
            h = h.next;
        }
        return false;

    }
    //main function

    public static void main(String[] args){
        LinkedList10 l = new LinkedList10();
        l.push(10);
        l.push(20);
        l.push(30);
        l.push(40);
        l.push(50);

        printList();

        // create a loop for testing
        l.head.next.next.next.next = l.head;
        if (detectLoop(head)){
            System.out.println("Loop found");
        }else{
            System.out.println("No Loop");
        }
    }
}