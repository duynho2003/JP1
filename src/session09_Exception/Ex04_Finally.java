package session09_Exception;
public class Ex04_Finally {
    public static void main(String[] args) {
        int[] num = {1, 2, 3};
        
        try{
            System.out.println(num[0]); //Error: ArrayIndexOutOfBoundsException
            //System.out.println(num[3]);
        }catch(ArrayIndexOutOfBoundsException ex){
            System.err.println("Tran mang!");
            
        }catch(Exception ex){
            ex.printStackTrace();
        }finally{
            System.out.println("Saving...");
        }
        
    }
}