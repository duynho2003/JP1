package template07_review02;

import java.util.Scanner;

public class ByciclesStore {

    public void menu() {
        int option;
        String s;
        //1. Khoi tao Scanner
        Scanner sc = new Scanner(System.in);
        ByciclesMag ex = new ByciclesMag();
        
        //2. In ra giao dien menu
        System.out.println("*************************");
        System.out.println("\t+1. Add new Bycicle");
        System.out.println("\t+2. Display all information");
        System.out.println("\t+3. Quit");
        System.out.println("*************************");

        //3. Cho nguoi dung nhap chon lua
        do {
            System.out.println("Enter your choice [1-4]: ");
            option = Integer.parseInt(sc.nextLine());

            switch (option) {
                case 1:
//                    System.out.println("Add");
                    ex.addBike();
                    break;
                case 2:
//                    System.out.println("Display");
                    ex.showBikes();//Ex02_Controller ex = new Ex02_Controller();
                    break;
                case 3:
                    System.out.println("Program Exit...");
                    System.exit(0);
                    break;
                default:
                    System.err.println("Your choice is incorrect!");
                    System.exit(0);
            }
            //4. Continue?
            System.out.println("Continue (Y/N)?");
            s = sc.nextLine();
            if (!s.equalsIgnoreCase("y")) {
                break;
            }

        } while (option != 4);
    }

    public static void main(String[] args) {
        new ByciclesStore().menu();
    }
}
