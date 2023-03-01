package session09_Exception;

public class Ex06_Throw_Throws {
    
    public void display(int err) throws Ex05_MyException{
        if(err == 0){
            System.out.println("Welcome, em.");
        }
        else{
            throw new Ex05_MyException("Xin loi em, ngan lan xin loi em!");
        }
    }
    
    public static void main(String[] args) throws Ex05_MyException{
        try{
            new Ex06_Throw_Throws().display(1);
        }catch(Ex05_MyException ex){
            ex.printStackTrace();
        }catch(Exception ex){}
//        new Ex06_Throw_Throws().display(1);
    }
}
