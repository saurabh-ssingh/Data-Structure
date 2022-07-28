//Find the length of linked list
public class LinkedList5 {
    static Node  head;
    public class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }
    public void push(int new_data){
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }
    public static void count(){
        Node temp = head;
        int counter = 0;
        while(temp != null){
            temp = temp.next;
            counter++;
        }
        System.out.println("Total number of node in linked list = " +counter);
    }

    public static void main(String[] args) {
        LinkedList5 llist = new LinkedList5();
        llist.push(10);
        llist.push(20);
        llist.push(30);
        llist.push(40);
        llist.push(50);
        count();
    }
}
