package session08_InterfaceNestedClass;
public class Ex02_Interface implements Ex01_Interface{

    @Override
    public void display(){
        System.out.println(myField);
    }
    
    public static void main(String[] args) {
        new Ex02_Interface().display();
    }
}
