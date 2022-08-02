/*
 Exception doesn’t occur in try-block: In this case catch block never runs as they are only meant to be run when an exception occurs. finally block(if present) will be executed followed by rest of the program. 
 
 */
public class Exception2 {
    public static void main(String[] args) {
        int a = 4;
        int b = 2;
        try {
            System.out.println("Division of a & b is " + a / b);
        } catch (Exception e) {
            e.printStackTrace();
            int sum = a + b;
            System.out.println("Sum of a and b is" + sum);
        }
        finally{
            System.out.println("I am in Finally block");
        }

        System.out.println("I am not in any block");
    }
}

/* 
Output:

Division of a & b is 2
I am in Finally block
I am not in any block 

*/