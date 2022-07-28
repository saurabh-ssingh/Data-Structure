// Inserting a node in front of list
class LinkedList2{
    static Node head;

    class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }
    // insert a node in front of list
    public void push(int new_data){
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    //print the list
    public static void printList(){
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.data+" ");
            temp = temp.next;
        }
    }

    //main function
    public static void main(String[] args) {
        LinkedList2 llist = new LinkedList2();
        llist.push(1);
        llist.push(2);
        llist.push(4);
        llist.push(5);
        printList();
    }
}
