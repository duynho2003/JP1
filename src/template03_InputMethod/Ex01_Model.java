package template03_InputMethod;
/*
Constructor:
    1. Trung ten Class
    2. Khong dung kieu tra ve
Default Constructor
    1. Ham dung mac dinh
    2. Khong co tham so
*/

import java.util.Scanner;

public class Ex01_Model {
    //1. Properties
    String code, name;
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
    public String output(){    
    String s = String.format("%s - %s ", code, name);
        return s;
    }
    
}
