//Search an element in linked list
public class LinkedList6 {
    static Node head;
    public class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }
    // Insert a node in front of list
    public void push(int new_data){
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    // print list

    public static void printList(){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.data+" ");
            temp = temp.next;

        }
    }
    // check whether the value of x is present in linked list or not
    public boolean search(Node head, int x){
        Node current = head;
        while(current != null){
            if(current.data == x){
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public static void main(String[] args) {
        LinkedList6 l = new LinkedList6();
        l.push(12);
        l.push(15);
        l.push(36);
        l.push(56);
        l.push(25);
        System.out.println("Element present in list is :");
        printList();
        if (l.search(l.head, 21))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
