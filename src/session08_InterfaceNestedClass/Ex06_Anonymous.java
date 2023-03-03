package session08_InterfaceNestedClass;
interface Polygon{
    void display();
}
class AnonymousDemo {
    public void createClass(){
        // anonymous class implementing interface
        Polygon p1 = new Polygon() {
            public void display(){
                    System.out.println("Inside an anonymous class.");
                }
            };
            p1.display();
        }//End createClass
    }//End AnonymousDemo
public class Ex06_Anonymous {
    public static void main(String[] args) {
        AnonymousDemo an = new AnonymousDemo();
        an.createClass();
    }
}