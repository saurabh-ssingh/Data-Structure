//                       **** Static Variable *****
// We cannot use  static keyword with local variable.

// If we declare a variable static , all the object of the class share the same static variable.
// and we don't need to create object of the class to access the static  variables.


// public class Static2 {
//     static int age = 20;
//     int money = 50;
//     public static void main(String[] args) {
//         Static2 obj = new Static2();
//         System.out.println("Age is "+Static2.age);
//         System.out.println("Money is "+obj.money);
//     }
// }

public class Static2{
    static int count = 0;
    Static2(){
        count++;
        System.out.println(count);
    }
    public static void main(String[] args) {
        Static2 obj1 = new Static2();
        Static2 obj2 = new Static2();
        Static2 obj3 = new Static2();
        Static2 obj4 = new Static2();
        
    }
}
