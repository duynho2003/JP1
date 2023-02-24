package session03_Construct;

import java.util.Scanner;

public class Ex02_Menu_Switch {

    public void menu() {
        int option;
        //1. Khoi tao Scanner
        Scanner sc = new Scanner(System.in);

        //2. In ra giao dien menu
        System.out.println("*************************");
        System.out.println("\t+1. Add");
        System.out.println("\t+2. Display");
        System.out.println("\t+3. Exit");
        System.out.println("*************************");

        //3. Chp nguoi dung nhap chon lua
        System.out.println("Enter your choice [1-3]: ");
        option = sc.nextInt();

        //4. Kiem tra option
        switch (option) {
            case 1:
                System.out.println("Add");
                break;
            case 2:
                System.out.println("Display");
                break;
            case 3:
                System.out.println("Program Exit...");
                System.exit(0);
                break;
            default:
                System.err.println("Your choice is incorrect!");
                break;
        }
    }
    public static void main(String[] args) {
        new Ex02_Menu_Switch().menu();
    }
}
