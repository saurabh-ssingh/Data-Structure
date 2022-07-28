//print middle of linked list
public class LinkedList12 {
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

    //finding length of linked list
    public static int getLen(){
        int count = 0;
        Node temp = head;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        return count;
    }

    //printing the middle element of linked list
    public static void printMiddle(){
        if(head != null){
            int length = getLen();
            Node temp = head;
            int middleLength = length/2;
            while(middleLength != 0){
                temp = temp.next;
                middleLength--;
            }
            System.out.print("The middle element is ["+ temp.data + "]");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        LinkedList12 l = new LinkedList12();
        for(int i=0;i<5;i++){
            l.push(i);
        }
        printList();
        printMiddle();
    }
}
