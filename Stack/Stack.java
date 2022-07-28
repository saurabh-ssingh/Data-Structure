public class Stack {
    int top;
    int a[] = new int[5];
    Stack(){
        top = -1;
        for(int i=0;i<5;i++){
            a[i] = 0;
        }
    }

    boolean isEmpty(){
        if(top == -1){
            System.out.println("Stack is Empty");
            return true;
        }else{
            System.out.println("Stack is not Empty");
            return false;
        }

    }
    
    boolean isFull(){
        if(top == 4){
            return true;
        }else{
            return false;
        }
    }
    
    void push(int val){
        if(isFull()){
            System.out.println("Stack overflow");
        }else{
            top++;
            a[top] = val;
        }
    }


    public static void main(String[] args) {
        Stack obj = new Stack();
        obj.push(2);
    }
}
