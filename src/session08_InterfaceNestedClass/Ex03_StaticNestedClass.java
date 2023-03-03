package session08_InterfaceNestedClass;
/**
 * A Static Nested Class
 * To be created inside a class;
 * Cannot access Outer non-static data members;
 * Can be accessed by Outer class name
 */
class Outer{
    static int outer_x = 10; //static member
        int outer_y = 20; // instance(non-static) member
        private static final int outer_private = 30; // private member

        static class StaticNested{
            void display(){
                //+ can access static member of outer class
                System.out.println("outer_x = " + outer_x);
                //+ can access display private static memeber of outer class
                System.out.println("outer_private = " + outer_private);
//                
                //+ The following statement will give compilation error
                //+ as static nested class cannot directly access non-static memebers
//              System.out.println("outer_y = " + outer_y); //Uncompilable code - non-static variable outer_y cannot be referenced from a static context
            }
        }//End StaticNested
}   //End Outer

// Driver class
public class Ex03_StaticNestedClass {
    public static void main(String[] args) {
        // accessing a static nested class
        Outer.StaticNested nestedObject = new Outer.StaticNested();
        nestedObject.display();
    }
}
