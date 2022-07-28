// Delete first node
public class LinkedList8 {
    static Node head;
    public class Node{
        int data;
        Node next;
        Node(int d){
            data =d;
            next = null;
        }
    }
    // push element in front of list
    public void push(int new_data){
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }
    // delete node from front of list
    public static void delete_from_front(){
        head = head.next;
    }
    // print the list
    public static void printList(){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.data+" ");
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        LinkedList8 l = new LinkedList8();
        l.push(1);
        l.push(2);
        l.push(3);
        l.push(4);
        l.push(5);
        l.push(6);
        printList();
        delete_from_front();
        System.out.println("List after deletion of front list");
        printList();
    }
}
