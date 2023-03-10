package session12_TheEnd;
interface DefaultStaticMethods{
    //using default keyword
    default void testDefault(){
        System.out.println("1.1. Default Methods is new Feature.");
    }
	
    static void testStatic(){
        System.out.println("1.2. Static Methods is too.");
    }
}

public class Chp1502_DefaultStaticMethods implements DefaultStaticMethods{
    void withoutStatic(){
        System.out.println("No Static.");
    }
    static void withStatic(){
        System.out.println("Static.");
    }
    public static void main(String[] args) {
        Chp1502_DefaultStaticMethods chp1502 = new Chp1502_DefaultStaticMethods();
        //Interface method
        chp1502.testDefault();
        DefaultStaticMethods.testStatic();  //Math.ramdom()
        //Class Method
        chp1502.withoutStatic();
        withStatic();
    }
}

