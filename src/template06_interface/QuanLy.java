package template06_interface;
import session08_InterfaceNestedClass.*;
import java.util.Scanner;

public class QuanLy {
    int max = 2;
    int next = 0;
    Scanner sc = new Scanner(System.in);
    DoiTuong[] model; // = new Ex01_Model[max];

    public QuanLy() {
        System.out.println("How many model would you like to manage?");
        max = Integer.parseInt(sc.nextLine());
        model = new DoiTuong[max];
    }

    public void addNew() {
        if (next >= max) {
            System.err.println("Cannot add more model!");
        } else {
            model[next] = new DoiTuong();
            model[next].input();
            next++;
        }
    }

    public void search() {
        //System.out.println("This is Search()");
        if(next == 0){
                System.err.println("Nothing To Display!");
            }
            else {
            String code;
            int cnt = 0;
            System.out.println("Enter Code: ");
            code = sc.nextLine();
                
            for(int i = 0; i < next; i++){
            if(code.equalsIgnoreCase( model[i].code)){
                cnt++;    
                System.out.println(model[i].output());
                    
                }
            }
            if (cnt == 0) {
                System.err.println("Not Found ! ");
            }
        }
    }

    public void display() {
            if(next == 0){
                System.err.println("Nothing To Display!");
            }
            else {
                for(int i = 0; i < next; i++){
                    System.out.println(model[i].output());
                }
            }
        }
    }

