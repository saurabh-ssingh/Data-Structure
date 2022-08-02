/* 
Types of exception:
    1)User-Defined exception
    2)Built-in exception
        1)Checked Exception(Compile Time Exception)
            i)ClassNotFoundException
            ii)Interrupted Exception
            iii)IO Exception
            iv)SQL Exception
            v)FileNotFoundException
        2) Unchecked Exception
            i)ArthmeticException
            ii)ClassCast Exception
            iii)Null Pointer Exception
            iv)ArrayIndexOutOfBounds Exception
            v)IllegalThredState Exception 


    try: The try block contains a set of statements where an exception can occur.
    catch : The catch block contains code that is executed if and when the exception handler is invoked.
            If try block has no any exception then catch block is not executed.

    Methods to print Exception Information
    i)printStackTrace()
    ii)toString() 
    iii)getMessage()

*/

public class Exception1{
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        try{
            System.out.println("Divsion = "+a/b);
        }catch(Exception e){
            e.printStackTrace();
            int sum = a+b;
            System.out.println("Sum of a and b is "+sum);
        }
    }
}

/*
Output:

java.lang.ArithmeticException: / by zero
        at Exception1.main(Exception1.java:35)
Sum of a and b is 5

 */