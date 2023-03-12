package fptaptech;

import academy.Worker;
import java.util.Scanner;

public class WorkerManager {

    //a,b,c
    public int nextWorker = 0;
    public int maxWorker = 2;
    Worker[] arr = new Worker[maxWorker];
    Scanner sc = new Scanner(System.in);

    public void menu() {
        int option;
        String s;

        System.out.println("*************************");
        System.out.println("\t+1. Add new worker");
        System.out.println("\t+2. Worker list");
        System.out.println("\t+3. Exit");
        System.out.println("*************************");

        do {
            System.out.println("Enter your choice [1-3]: ");
            option = Integer.parseInt(sc.nextLine());

            switch (option) {
                case 1:
                    saveWorker(new Worker());
                    break;
                case 2:
                    showAll();
                    break;
                case 3:
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
        } while (option != 3);
    }

    public void saveWorker(Worker worker) {
        String name = null, address = null;
        int year_of_birth = 0, ID;
        if (nextWorker >= maxWorker) {
            System.err.println("Cannot add more than " + maxWorker + " workers");
            return;
        }

        System.out.println("Enter worker id: ");
        ID = Integer.parseInt(sc.nextLine());
        do {
            try {
                System.out.print("Enter worker name: ");
                name = sc.nextLine();
                if (name.isBlank()) {
                    throw new Exception("Name cannot be blank.");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (name.isBlank());

        do {
            try {
                System.out.print("Enter worker address: ");
                address = sc.nextLine();
                if (address.isBlank()) {
                    throw new Exception("Address cannot be blank.");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (address.isBlank());

        do {
            try {
                System.out.print("Enter worker year of birth: ");
                year_of_birth = Integer.parseInt(sc.nextLine());
                if (year_of_birth <= 1965 || year_of_birth >= 2005) {
                    throw new Exception("Year of birth must be between 1966 and 2004.");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (year_of_birth <= 1965 || year_of_birth >= 2005);

        arr[nextWorker] = new Worker(ID, name, address, year_of_birth);
        nextWorker++;
    }

    public void showAll() {
        System.out.println("Worker list:");
        if (nextWorker == 0) {
            System.err.println("Nothing to display!");
        }
        for (int i = 0; i < nextWorker; i++) {
            System.out.println(arr[i].toString());
        }
    }

    public static void main(String[] args) {
        new WorkerManager().menu();
    }
}
