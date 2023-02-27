package test_pretest1;
import executive_pretest1.ExecutiveStaff;
import java.util.Scanner;

public class StaffTest {
    int maxStaff = 2;
    int nextStaff = 0;
    ExecutiveStaff[] es;
    
    public StaffTest(){
        es = new ExecutiveStaff[maxStaff];
    }
    void createStaff(){
        es[nextStaff] = new ExecutiveStaff();
        es[nextStaff].input();
        nextStaff++;
    }
    
    
    
    void viewStaffs(){
        int cnt = 0;
        for(int i = 0; i < nextStaff; i++){
            if(es[i].salary > 800){
                System.out.println(es[i]);
                cnt++;
            }
        }
        if(cnt == 0){
            System.err.println("Nothing to display!");
        }
    }
    
    void menu(){
        int option;
        String s;
        Scanner sc = new Scanner(System.in);
        System.out.println("*************************");
        System.out.println("\t+1. Add Staff");
        System.out.println("\t+2. Display Staff");
        System.out.println("\t+3. Exit");
        System.out.println("*************************");
        do {
            System.out.println("Enter your choice [1-3]: ");
            option = Integer.parseInt(sc.nextLine());

            switch(option) {
                case 1:
                    createStaff();
                    break;
                case 2:
                    viewStaffs();
                    break;
                case 3:
                    System.out.println("Program Exit...");
                    System.exit(0);
                    break;
                default:
                    System.err.println("Your choice is incorrect!");
                    System.exit(0);
            }
            System.out.println("Continue (Y/N)?");
            s = sc.nextLine();
            if (!s.equalsIgnoreCase("y")) {
                break;
            }

        } while (option != 3);
    }
    
    public static void main(String[] args) {
        new StaffTest().menu();
    }
}
