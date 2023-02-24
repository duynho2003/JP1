package session01_Introduction;

public class Ex02_ClassObject {
    //1. Properties
    int myField = 100;
    //2. Methods
    void myMethod(){
        System.out.println("Giá trị myField là: " + myField);
    }
           
    public static void main(String[] args) {
        var ex02Object = new Ex02_ClassObject();
        ex02Object.myMethod();
    }
}
