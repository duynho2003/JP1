package template02__Arrays;

import java.util.Scanner;

public class Ex02_Controller {

    int max = 2;
    int next = 0;
    Scanner sc = new Scanner(System.in);
    Ex01_Model[] model; // = new Ex01_Model[max];

    public Ex02_Controller() {
        System.out.println("How many model would you like to manage?");
        max = sc.nextInt();
        model = new Ex01_Model[max];
    }

    public void addNew() {
        if (next >= max) {
            System.err.println("Cannot add more model!");
        } else {
            model[next] = new Ex01_Model();
            next++;
        }
    }

    public void search() {
        System.out.println("This is Search()");
    }

    public void display() {
//        System.out.println("This is display()");
//        for (int i = 0; i < model.length; i++) {
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
