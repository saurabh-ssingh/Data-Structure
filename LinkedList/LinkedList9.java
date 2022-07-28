public class LinkedList9 {
    static Node head;
    public class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }
    //Insert node at front of list
    public void push(int new_data){
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node; 
    }
    // Delete a node from middle of list
    public void delete_from_list(int new_data){
       
    }
    // print list
    public static void printList(){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.data+"");
            temp = temp.next;
        }
    }

    //main
    public static void main(String[] args) {
        LinkedList9 l = new LinkedList9();
        l.push(2);
        l.push(4);
        l.push(6);
        l.push(8);
        l.push(10);
        printList();
    }
}
