package session12_TheEnd;

public class Chp1503_MethodReferences {
    static void show(String s){  
        System.out.println(s);  
    }  
 
    public static void main(String[] args) {
        
        // Reference to the static method  
        Message mes = Chp1503_MethodReferences::show;  
        // Call interface method  
        mes.display("Reference to a Static Method.");
    }  
}

