package template05_ParameterConstructor;
import java.util.Scanner;

public class Ex01_Model {
    //1. Properties
    String code, name;
    Scanner sc = new Scanner(System.in);
    
    //Parameter Constructor (Loai 3)
    public Ex01_Model(String code, String name){
        this.code = code;
        this.name = name;
    }

    Ex01_Model() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    //2. Input data by Input Method (Loai 2a)
    //public Ex01_Model(){
//    public void input(){
//        System.out.println("Enter code: ");
//        code = sc.nextLine();
//        System.out.println("Enter name: ");
//        name = sc.nextLine();
//    }
    
    //3. Format data
    //@Override
    //public String toString(){
    
    //OUTPUT DATA BY OUTPUT METHOD [LOAI 2b]
    public String output(){    
    String s = String.format("%s - %s ", code, name);
        return s;
    }

    void input() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
