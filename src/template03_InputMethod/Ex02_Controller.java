package template03_InputMethod;

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

    public void addNew() {
        if (next >= max) {
            System.err.println("Cannot add more model!");
        } else {
            model[next] = new Ex01_Model();
            model [next].input();
            next++;
        }
    }
    public void search() {
        //System.out.println("This is Search()");
        if(next == 0){
           System.err.println("Nothing To Display!");
        }
        else{
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

