package HomeworkDoctor;
import java.util.Scanner;

public class DoctorTest {

    public void menu() {
        int option;
        String s;
        //1. Khoi tao Scanner
        Scanner sc = new Scanner(System.in);
        DoctorApp ex = new DoctorApp();
        
        //2. In ra giao dien menu
        System.out.println("*************************");
        System.out.println("\t+1. Add new Doctor ");
        System.out.println("\t+2. Search Doctor");
        System.out.println("\t+3. Display Doctor");
        System.out.println("\t+4. Exit");
        System.out.println("*************************");

        //3. Cho nguoi dung nhap chon lua
        do {
            System.out.println("Enter your choice [1-4]: ");
            option = Integer.parseInt(sc.nextLine());

            switch (option) {
                case 1:
                    ex.addNew();
                    break;
                case 2:
                    ex.search();
                    break;
                case 3:
                    ex.display();
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
            s = sc.nextLine();
            if (!s.equalsIgnoreCase("y")) {
                break;
            }

        } while (option != 4);
    }

    public static void main(String[] args) {
        new DoctorTest().menu();
    }
}
