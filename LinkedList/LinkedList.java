
class LinkedList{
    Node head; //head of the list

    static class Node{  //inner class is made static so that main() can access it
        int data;
        Node next;
        //constructor of Node class
        Node(int d){
            this.data = d;
            next = null;
        }  
    }
    // This function prints contents of Linked List starting from head
    public void  printList(){
        Node n = head;
        while(n != null){
            System.out.println(n.data+" ");
            n = n.next;
        }
    }
    // method to create a simple linked list with 3 nodes
    public static void main(String[] args){
        // start with the empty list
        LinkedList llist = new LinkedList();
        llist.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);

        llist.head.next = second; //Link first node with second node
        second.next = third;   // Link second node with third node
        third.next = fourth;   // Link third node with fourth
        llist.printList();
    }

}