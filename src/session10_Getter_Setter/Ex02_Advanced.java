package session10_Getter_Setter;

import java.util.Scanner;

class Advanced{
    private int balance = 0;
    Scanner sc = new Scanner(System.in);
    
    private boolean login(String user, String password){
        if (!user.equalsIgnoreCase("aptech") || !password.equals("123")){
            return false;
        }
        return true;
    }
    public int getBalance(){
        return balance;
    }
    public void setBalance(int balance){
        String acc, pass;
        do{
            System.out.println("Enter your username: ");
            acc = sc.nextLine();
            System.out.println("Enter your password: ");
            pass = sc.nextLine();
            
            if (!login(acc,pass)){
                System.err.println("Account or Password is incorrect!");
            }
        }while(!login(acc, pass));
        
        this.balance = balance;
    }
}
public class Ex02_Advanced {
    public void display(){
        Advanced sp = new Advanced();
        // int num = sp.balance; //Error: cannot access private field in Simple
        sp.setBalance(1000); // Set - Write => balance = 1000;
        int num = sp.getBalance(); // Get - Read => num = balance;
        System.out.println("Balance is: " + num);
    }
    public static void main(String[] args) {
        new Ex02_Advanced().display();
    }
}
