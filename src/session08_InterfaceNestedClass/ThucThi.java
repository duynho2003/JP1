package session08_InterfaceNestedClass;

import java.util.Scanner;
public class ThucThi {
        public void menu() {
        int option;
        String s;
        QuanLy ex = new QuanLy();
        //1. Khoi tao Scanner
        Scanner sc = new Scanner(System.in);

        //2. In ra giao dien menu
        System.out.println("*************************");
        System.out.println("\t+1. Add");
        System.out.println("\t+2. Search");
        System.out.println("\t+3. Display");
        System.out.println("\t+4. Exit");
        System.out.println("*************************");

        //3. Chp nguoi dung nhap chon lua
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
                    ex.display(); //QuanLy ex = new QuanLy();
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
        new ThucThi().menu();
    }
}
