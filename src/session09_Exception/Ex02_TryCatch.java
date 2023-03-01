package session09_Exception;
public class Ex02_TryCatch {
    public static void main(String[] args) {
        int[] num = {1, 2, 3};
        
        try{
            System.out.println(num[2]); //Error: ArrayIndexOutOfBoundsException    
        }catch(Exception ex){
            //System.err.println("Tran mang!");
            ex.printStackTrace(); //ArrayIndexOutOfBoundsException
        }
        
    }
}