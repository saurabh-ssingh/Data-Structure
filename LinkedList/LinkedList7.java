//Delete complete linked list
public class LinkedList7 {
    static Node head;
    public class Node{
        int data;
        Node next;
        Node(int d){
            data =d;
            next = null;
        }
    }

    //push element in front of list
    public void push(int new_data){
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    //delete the complete list

    public static void delete(){
        head = null;
    }

    public static void printList(){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.data+" ");
            temp = temp.next;

        }
    }

    public static void main(String[] args) {
        LinkedList7 l = new LinkedList7();
        l.push(1);
        l.push(2);
        l.push(3);
        l.push(4);
        l.push(5);
        printList();
        delete();
    }
}
