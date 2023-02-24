package template02__Arrays;
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
    
    //2. Input data by Default Constructor
    public Ex01_Model(){
        System.out.println("Enter code: ");
        code = sc.nextLine();
        System.out.println("Enter name: ");
        name = sc.nextLine();
    }
    
    //3. Format data
    @Override
    public String toString(){
        String s = String.format("%s - %s ", code, name);
        return s;
    }
    
}
