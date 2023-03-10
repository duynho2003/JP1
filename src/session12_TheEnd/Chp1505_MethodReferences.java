package session12_TheEnd;
interface Template{
    Chp1505_MethodReferences get(String no, String name);
}

public class Chp1505_MethodReferences {
    String no, name;
    
    public Chp1505_MethodReferences(String no, String name){
        this.no     = no;
        this.name   = name;
    }
    @Override
    public String toString(){
        return "No: " + this.no +"\nName: " + name;
    }
    
    public static void main(String[] args) {
        Template tmp;
        Chp1505_MethodReferences three;
        tmp = Chp1505_MethodReferences::new;
        three = tmp.get("Student01","Lê Văn A");
        System.out.println(three.toString());
    }
}

