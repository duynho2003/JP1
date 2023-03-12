package template10_ParameterConstructor;
import java.util.Scanner;

public class Ex02_Controller {
    int max = 2;
    int next = 0;
    Scanner sc = new Scanner(System.in);
    Ex01_Model[] model; // = new Ex01_Model[max];

    public Ex02_Controller() { 
        System.out.println("How many model would you like to manage?");
        max = Integer.parseInt(sc.nextLine());
        model = new Ex01_Model[max];
    }
    public void addNew(Ex01_Model md){ //Buoc 1
        if (next >= max) {
            System.err.println("Cannot add more model!");
        } else {
            String x, y;
            System.out.println("Enter code: ");
            x = sc.nextLine();
            System.out.println("Enter name: ");
            y = sc.nextLine();
            model[next] = new Ex01_Model(x, y);
            next++;
        }
    }
    public void search() {
        //System.out.println("This is Search()");
        if(next == 0){
                System.err.println("Nothing To Display!");
            }
            else {
            String x;
            int cnt = 0;
            System.out.println("Enter Code: ");
            x = sc.nextLine();
                
            for(int i = 0; i < next; i++){
            if(x.equalsIgnoreCase( model[i].code)){
                cnt++;    
                System.out.println(model[i]);
                    
                }
            }
            if (cnt == 0) System.err.println("Not Found ! ");}
    }

    public void display() {
//        System.out.println("This is display()");
//        for (int i = 0; i < model.length; i++) {
        //for (int i = 0; i < next; i++) {
            //System.out.println(model[i]);
            
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

