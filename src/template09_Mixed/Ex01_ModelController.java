package template09_Mixed;

import java.util.Scanner;

public class Ex01_ModelController {
    //1.Model Properties
    String code, name;
    static Scanner sc = new Scanner(System.in);

    //2. Input data by input method
    public void input() {
        System.out.println("Enter code: ");
        code = sc.nextLine();
        System.out.println("Enter name: ");
        name = sc.nextLine();
    }
    //3. Format data
    @Override
    public String toString() {
        String s = String.format("%s - %s ", code, name);
        return s;
    }
    //4. Khai bao mang
    static int max = 2;
    static int next = 0;
    static Ex01_ModelController[] model = new Ex01_ModelController[max];
    //5. Khoi tao_ Bo qua
    //6. addNew()
    public static void addNew(){
            if (next >= max) {
            System.err.println("Cannot add more model!");
            } 
            else {
            model[next] = new Ex01_ModelController();
            model[next].input();
            next++;
        }
    }
    //7. seach()
    public static void search(){
            if (next == 0) {
            System.out.println("This is Search()");
        } 
        else {
            String code;
            int cnt = 0;
            System.out.println("Enter code: ");
            code = sc.nextLine();
            for (int i = 0; i < next; i++) {
                if (code.equalsIgnoreCase(model[i].code)){
                    cnt++;
                    System.out.println(model[i]);
                }
            }
            if (cnt == 0) {
                System.err.println("Not found!");
            }
        }
    }
    //8. display()
    public static void display(){
        if (next == 0) {
            System.err.println("Nothing to display");
        } 
        else {
            for (int i = 0; i < next; i++) {
                System.out.println(model[i]);
            }
        }
    }
}