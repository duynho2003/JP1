package session08_InterfaceNestedClass;

// outer class
class OuterClass{
    static int outer_x = 10;        // static memeber
    int outer_y = 20;               // instance (non-static) member
    private int outer_private = 30; // private memeber
    
    // inner class
    class Inner {
        void display(){
            //+ can acces static memeber of outer class
            System.out.println("outer_x =" + outer_x);
            
            //+ can acces non-static memeber of outer class
            System.out.println("outer_y = " + outer_y);
            
            //+ can acces a private memeber of outer class
            System.out.println("outer_private = " + outer_private);
        }
    }
}
public class Ex04_InnerClass {
    public static void main(String[] args) {
        // accessing an inner class
        OuterClass outerObject = new OuterClass();
        OuterClass.Inner innerObject = outerObject.new Inner();
        innerObject.display();
    }
}
