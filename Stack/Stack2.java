//popping element 
public class Stack2 {
    int top;
    int a[] = new int[5];
    Stack2(){
        top = -1;
    }

    //pushing element into stack
    boolean push(int x){
        if(top > 4){
            System.out.println("Stack Overflow");
            return false;
        }else{
            top++;
            a[top]=x;
            return true;
        }
    }
    
    //poping element out of stack
    int pop(){
        if(top < 0){
            System.out.println("Stack Underflow");
            return 0;
        }else{
            int x = a[top];
            top--;
            System.out.println("Popped element is "+x);
            return x;
        }
    }

    //printing element into stack
    void print(){
        for(int i=0;i<5;i++){
            System.out.println(a[i]+ " ");
        }
    }
    

    //main function
    public static void main(String[] args) {
        Stack2 obj = new Stack2();
        obj.push(10);
        obj.push(20);
        obj.push(30);
        obj.push(40);
        obj.push(50);
        System.out.println("stack before pop");
        obj.print();
        obj.pop();
        System.out.println("stack after pop");
        obj.print();
    }
}

