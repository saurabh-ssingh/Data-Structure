//Find length of loop in linked list
public class LinkedList13 {
    static Node head;
    public class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }
// returns count of nodes present in loop
static int countNodes(Node n){
    int count = 1;
    Node temp = n;
    while(temp.next != n){
        count++;
        temp = temp.next;
    }
    return count;
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

    public static void main(String[] args) {
        LinkedList13 l = new LinkedList13();
        for(int i=0;i<5;i++){
            l.push(i);
        }
        printList();
    }
}
