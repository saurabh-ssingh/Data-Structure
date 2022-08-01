//                     ***** Static Method  *****

// Static method belong to class not object it means we can access static method without creating
// any object of class.

// A static method can only access static data. It cannot access non static data.

// A static method can call only other static methods and cannot call a non-static method.

// A static keyword can not refers to "this" or "super" keyword in anyway.

public class Static {
    static void m1(){
        System.out.println("I am static method");
    }
    void m2(){
        System.out.println("Out side main functin");
    }
    public static void main(String[] args) {
        //calling m1 without creating any object of the class
        Static obj = new Static();
        System.out.println("Inside main function");
        obj.m2();
        m1();
    }
}
