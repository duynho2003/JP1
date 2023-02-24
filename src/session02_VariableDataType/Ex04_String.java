package session02_VariableDataType;

public class Ex04_String {
    String giatriLiteral = "Gan gia tri kieu literal";
    String giatriConstructor = new String("Gan gia tri kieu Constructor");
    
    void display(){
        System.out.println(giatriLiteral + " - " + giatriConstructor);
    }
    public static void main(String[] args) {
        new Ex04_String().display();
    }
}
