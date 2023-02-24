package session02_VariableDataType;

public class Ex01_ClassMethodVariable {
    //1. Class Variable
    String bienLop = "Bien lop";
    
    void myMethod(){
        String bienMethod = "Bien method";
        System.out.println("Bien: " + bienLop + " Bien: " + bienMethod);
    }
    public static void main(String[] args) {
        new Ex01_ClassMethodVariable().myMethod();
    }
}
