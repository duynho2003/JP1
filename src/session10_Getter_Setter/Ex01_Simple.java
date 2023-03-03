package session10_Getter_Setter;

class Simple{
    private int balance = 0;
    
    public int getBalance(){
        return balance;
    }
    public void setBalance(int balance){
        this.balance = balance;
    }
}
public class Ex01_Simple {
    public void display(){
        Simple sp = new Simple();
        // int num = sp.balance; //Error: cannot access private field in Simple
        sp.setBalance(1000); // Set - Write => balance = 1000;
        int num = sp.getBalance(); // Get - Read => num = balance;
        System.out.println("Balance is: " + num);
    }
    public static void main(String[] args) {
        new Ex01_Simple().display();
    }
}
