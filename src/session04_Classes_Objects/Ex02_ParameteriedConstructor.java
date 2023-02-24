package session04_Classes_Objects;

import java.util.Scanner;
/*
    Constructor:
        1. Trung ten Class
        2. Khong dung kieu tra ve
    Parameteried Constructor:
        1. Ham dung
        2. Co tham so
*/

public class Ex02_ParameteriedConstructor {
    //1. Properties
    String code, name;
    //2. Parameteried Constructor
    public Ex02_ParameteriedConstructor(String code, String name){
        this.code   = code;
        this.name   = name;
    }
    
    //3. Override toString()
    @Override
    public String toString(){
        String s = String.format("Code: %s - Name: %s", this.code, this.name);
        return s;
    }
    public static void main(String[] args) {
        //Khai bao
        String code, name;
        Scanner sc = new Scanner(System.in);
        //Nhap
        System.out.println("Enter code: ");
        code = sc.nextLine();
        System.out.println("Enter name: ");
        name = sc.nextLine();
        //Xuat
        var test = new Ex02_ParameteriedConstructor(code, name);
        //System.out.println(test.toString());
        System.out.println(test);
    }
}
