package session06_Inheritance;

public class Ex02_Con extends Ex01_Cha{
    int tien = 1;
    
    public Ex02_Con(){
        super(); //Goi Constructor tu Base Class
    }
    
    @Override
    public void kinhdoanh(){
        System.out.println("Con pha het tien roi!");
    }
    
    public void hocthem(){
        System.out.println("Dong hoc phi: " + tien);
        super.kinhdoanh();
        this.kinhdoanh();
    }
    
    public static void main(String[] args) {
        new Ex02_Con().hocthem();
        
        Ex01_Cha testDownCasting = new Ex02_Con();
//        Ex02_Con test = new Ex01_Cha();
    }
}
