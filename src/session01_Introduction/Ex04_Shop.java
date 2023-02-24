package session01_Introduction;
import java.util.Scanner;

public class Ex04_Shop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ex04_Login login = new Ex04_Login();
        
        System.out.println("Nhap ten truy cap: ");
        String userName = sc.nextLine();
        System.out.println("Nhap mat khau: ");
        String pass = sc.nextLine();
        
        if(login.check(userName, pass)){
            System.out.println("Dang nhap thanh cong");
        }else{
            System.err.println("Sai ten dang nhap hay mat khau!");
        }
            
    }
}
