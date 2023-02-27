package template04_Review01;
import java.util.Scanner;

public class ExecutiveStaff extends Staff {

    public int salary, bonus;
    Scanner sc = new Scanner(System.in);

    @Override
    public void input() {
        System.out.println("Enter ID: ");
        id = sc.nextLine();
        System.out.println("Enter name: ");
        name = sc.nextLine();
        System.out.println("Enter salary:");
        salary = Integer.parseInt(sc.nextLine());
        
        //Bonus
        do{
            System.out.println("Enter bonus: ");
            bonus = Integer.parseInt(sc.nextLine()); //bonus >= 0 && bonus <= 100
            if(bonus < 0 || bonus > 100){
                System.err.println("Valid rank in : [0 - 100]");
            }
        }while(bonus < 0 || bonus > 100);
    }
    
    @Override
    public String toString() {
        String s = String.format("ID: %s\tName: %s\tSalary: %d\tBonus:  %d", id, name, salary, bonus);
        return s;
    }
}
