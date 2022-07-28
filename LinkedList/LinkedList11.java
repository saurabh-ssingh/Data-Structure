//check loop in list 
// using Floyd’s Cycle-Finding Algorithm: 

public class LinkedList11 {
    static Node head;
    public class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }

    // push node in front part of linked list
    public void push(int new_data){
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    //print list
    public static void printList(){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.data+"");
            temp = temp.next;
        }
    }
    // check loop
    static void detectLoop(){
        Node slow_ptr =head, fast_ptr=head;
        int flag = 0;
        while(slow_ptr != null && fast_ptr != null && fast_ptr.next != null){
            slow_ptr = slow_ptr.next;
            fast_ptr = fast_ptr.next.next;
            if(slow_ptr == fast_ptr){
                flag = 1;
                break;
            }
        }
        if(flag == 1){
            System.out.println("Loop found");
        }else{
            System.out.println("Loop Not found");
        }
    }
    //main function
    public static void main(String[] args) {
        LinkedList11 l = new LinkedList11();
        l.push(20);
        l.push(7);
        l.push(8);
        l.push(42);
        l.push(52);
        printList();

        // create loop for testing 
        l.head.next.next.next = l.head;
        detectLoop();
    }
}
