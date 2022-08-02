/* 
Exception occurred in try-block is not handled in catch block: In this case, default handling mechanism is followed. If finally block is present, it will be executed followed by default handling mechanism. 
*/ 
public class Exception3{
    public static void main(String[] args) {
        int a=4,b=0;
        try{
            System.out.println("Division of a & b is "+a/b);
        }catch(NullPointerException  e){     
            // not a appropriate handler
            System.out.println("Exception has been caught");
        }
        finally{
            System.out.println("I am in finally block");
        }
         // rest program will not execute
        System.out.println("I am not in any block");
    }
}