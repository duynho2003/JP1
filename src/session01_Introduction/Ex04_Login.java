package session01_Introduction;

public class Ex04_Login {
    //A Method Only
    boolean check(String user, String password){
        if(!(user.equalsIgnoreCase("aptech")) || !(password.equals("123"))){
//            System.err.println("Username or Password is incorrect!");
            return false;
        }
        return true;
    }
}
