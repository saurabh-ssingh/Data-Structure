//pushing element into Stack

public class Stack1{
    int top;
    int a[] = new int[5];

    Stack1(){
        top = -1;
    }

    boolean push(int x){
        if(top > 4){
            System.out.println("Stack overflow");
            return false;
        }else{
            top++;
            a[top]=x;
            
            return true;
        }
    }

    //printing of element
    void print(){
        for(int i=top;i>-1;i--){
            System.out.println(" "+a[i]);
        }
    }

    //main function
    public static void main(String[] args) {
        Stack1 obj = new Stack1();
        obj.push(10);
        obj.push(20);
        obj.push(30);
        obj.print();
    }
}