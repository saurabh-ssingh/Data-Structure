

//                         ***** Static Block *****

//static block that gets executed exactly once, when the class is first loaded.

// Without main method we can print anything with the help of static block if we have 
//java version < 1.6.


// we can create multiple static variable

// public class Static1 {
//     //static variable
//     static int a = 10;
//     static int b;

//     //static block
//     static{
//         System.out.println("Static block initilized");
//         b = a * 4;
//     }

//     public static void main(String[] args) {
//         System.out.println("From main");
//         System.out.println("Value of a is "+a);
//         System.out.println("Value of b is "+b);
//     }
// }

public class Static1{
    static{
        System.out.println("Static Block");
    }
    public static void main(String[] args) {
        System.out.println("Main Function");
    }
}
