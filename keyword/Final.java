package keyword;
//final variable => we cannot change the value of final varible
//final method => If you make any method as final, you cannot override it.
//final class => If you make any class as final, you cannot extend it.
public class Final {
    
    //*********final variable********
//    final int var = 100;
//    void run(){
//     var = 200;
//    }

//     public static void main(String[] args) {
//         Final obj = new Final();
//         obj.run();
//     }

    //*******final method */
    // class Bike{
    //     final void run(){
    //         System.out.println("I am in final method");
    //     }
    // }

    // class Ktm extends Bike{
    //     void run(){
    //         System.out.println("I am in second final method");
    //     }
    // }

    // public static void main(String[] args) {
    //     Ktm obj = new Ktm();
    //     obj.run();
    // }


    //****final class */
    final class Bike{}
    class Ktm extends Bike{
        
    }
}


