package template04_Review01;

import java.util.Scanner;

public class ExecutiveStaff extends Staff {

    Scanner sc = new Scanner(System.in);

    @Override
    public void input() {
        System.out.println("Enter code: ");
        id = sc.nextLine();
        System.out.println("Enter name: ");
        name = sc.nextLine();
    }
}
