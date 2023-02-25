package session06_Inheritance;
import java.util.Scanner;

public class Ex04_Con extends Ex03_Cha {
    String code, name;
    Scanner sc = new Scanner(System.in);

    @Override
    public void input() {
        System.out.println("Enter code: ");
        code = sc.nextLine();
        System.out.println("Enter name: ");
        name = sc.nextLine();
    }

    public String toString() {
        String s = String.format("Code : %s - Name: %s", code, name);
        return s;
    }

    public static void main(String[] args) {
        var con = new Ex04_Con();
        con.input();
        System.out.println(con.toString());
    }
}
