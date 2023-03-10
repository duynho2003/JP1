package session12_TheEnd;
@FunctionalInterface
interface MyReferences{  
    void display(String message);  
} 

public class Chp1504_MethodReferences {
    public void methodRef(String s){  
	System.out.println(s);  
    }  
     
    public static void main(String[] args) {  
	Chp1504_MethodReferences three = new Chp1504_MethodReferences();
        // Using Lamda Expression
        MyReferences mr = mes -> System.out.println(mes);
        mr.display("Lamda Expression.");
	/*
            Using Reference to an Instance Method
            1. Method reference using the Instance of the class
            2. Calling the method of functional interface
        */
	MyReferences ref = three::methodRef;  
	ref.display("Reference to an Instance Method.");  
    }  
}


