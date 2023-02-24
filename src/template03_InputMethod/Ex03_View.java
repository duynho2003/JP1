package template03_InputMethod;

import java.util.Scanner;

public class Ex03_View {

    public void menu() {
        int option;
        String s;
        Ex02_Controller ex = new Ex02_Controller();
        //1. Khoi tao Scanner
        Scanner sc = new Scanner(System.in);
        //Ex02_Controller ex = new Ex02_Controller();
        //2. In ra giao dien menu
        System.out.println("*************************");
        System.out.println("\t+1. Add");
        System.out.println("\t+2. Search");
        System.out.println("\t+3. Display");
        System.out.println("\t+4. Exit");
        System.out.println("*************************");

        //3. Cho nguoi dung nhap chon lua
        do {
            System.out.println("Enter your choice [1-4]: ");
            option = sc.nextInt();

            switch (option) {
                case 1:
//                    System.out.println("Add");
                    ex.addNew();
                    break;
                case 2:
//                    System.out.println("Display");
                    ex.search();
                    break;
                case 3:
//                    System.out.println("Display");
                    ex.display(); //Ex02_Controller ex = new Ex02_Controller();
                    break;
                case 4:
                    System.out.println("Program Exit...");
                    System.exit(0);
                    break;
                default:
                    System.err.println("Your choice is incorrect!");
                    System.exit(0);
            }
            //4. Continue?
            System.out.println("Continue (Y/N)?");
            s = sc.next();
            if (!s.equalsIgnoreCase("y")) {
                break;
            }

        } while (option != 4);
    }

    public static void main(String[] args) {
        new Ex03_View().menu();
    }
}
