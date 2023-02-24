package session03_Construct;
import java.util.Scanner;

public class Ex03_Menu_Loop {

    public void menu() {
        int option;
        String s;
        //1. Khoi tao Scanner
        Scanner sc = new Scanner(System.in);

        //2. In ra giao dien menu
        System.out.println("*************************");
        System.out.println("\t+1. Add");
        System.out.println("\t+2. Display");
        System.out.println("\t+3. Exit");
        System.out.println("*************************");

        //3. Chp nguoi dung nhap chon lua
        do{
            System.out.println("Enter your choice [1-3]: ");
            option = sc.nextInt();
            
            switch(option){
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
            //4. Continue?
            System.out.println("Continue (Y/N)?");
            s = sc.next();
            if(!s.equalsIgnoreCase("y")){
                break;
            }
            
        }while (option != 3);
    }
    public static void main(String[] args) {
        new Ex03_Menu_Loop().menu();
    }
}