package session09_Exception;
public class Ex03_MultiTryCatch {
    public static void main(String[] args) {
        int[] num = {1, 2, 3};
        
        try{
            System.out.println(num[3]); //Error: ArrayIndexOutOfBoundsException    
        }catch(ArrayIndexOutOfBoundsException ex){
            System.err.println("Tran mang!");
            
        }catch(Exception ex){
            ex.printStackTrace();
        }
        
    }
}