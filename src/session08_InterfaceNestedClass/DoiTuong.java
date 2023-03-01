package session08_InterfaceNestedClass;
import java.util.Scanner;

public class DoiTuong extends Cha{
    //1. Properties
    String name;
    Scanner sc = new Scanner(System.in);
    
    //2. Input data by Input Method (Loai 2a)
    //public Ex01_Model(){
    public void input(){
        System.out.println("Enter code: ");
        code = sc.nextLine();
        System.out.println("Enter name: ");
        name = sc.nextLine();
    }
    
    //3. Format data
    //@Override
    //public String toString(){
    
    //OUTPUT DATA BY OUTPUT METHOD [LOAI 2b]
    @Override
    public String output(){    
    String s = String.format("Code: %s - Name: %s ", code, name);
        return s;
    }
    
}
