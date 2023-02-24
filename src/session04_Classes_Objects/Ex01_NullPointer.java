package session04_Classes_Objects;

public class Ex01_NullPointer {
    
    public void sayHello(){
        System.out.println("Hello!");
    }
    public static void main(String[] args) {
        
        Ex01_NullPointer test1; 
        Ex01_NullPointer test2 = new Ex01_NullPointer();
        //variable test1 might not have been initialized at session04_Classes_Objects.Ex01_NullPointer.main(Ex01_NullPointer.java:1)
        //test1.sayHello();
        //OK
        test2.sayHello();
    }
}
