package HomeworkDoctor;

import java.util.Scanner;

public class DoctorApp {
    int max = 2;
    int next = 0;
    Scanner sc = new Scanner(System.in);
    Doctor[] doctor; // = new Ex01_Model[max];

    public DoctorApp() {
        System.out.println("How many doctor would you like to manage?");
        max = Integer.parseInt(sc.nextLine());
        doctor = new Doctor[max];
    }
    public void addNew() {
        if (next >= max) {
            System.err.println("Cannot add more doctor!");
        } 
        else {
            String x, y;
            int z;
            System.out.println("Enter ID: ");
            x = sc.nextLine();
            System.out.println("Enter Name: ");
            y = sc.nextLine();
            System.out.println("Enter Salary: ");
            z = Integer.parseInt(sc.nextLine());
            doctor[next] = new Doctor();
            doctor[next].setValues(x, y, z);
            next++;
        }
    }
    public void search() {
        if(next == 0){
                System.err.println("Nothing To Display!");
            }
            else {
            String x;
            int cnt = 0;
            System.out.println("Enter ID: ");
            x = sc.nextLine();
                
            for(int i = 0; i < next; i++){
            if(x.equalsIgnoreCase( doctor[i].ID)){
                cnt++;    
                System.out.println(doctor[i].output());
                    
                }
            }
            if (cnt == 0) System.err.println("Not Found ! ");}
    }

    public void display() {
            if(next == 0){
                System.err.println("There is no doctor to display!");
            }
            else {
                for(int i = 0; i < next; i++){
                    System.out.println(doctor[i].output());
                }
            }
        }
    }

