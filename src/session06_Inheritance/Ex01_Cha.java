package session06_Inheritance;

public class Ex01_Cha {
    int tien = 20_000;
    public Ex01_Cha(){
        System.out.println("Class Ex01_Cha Constructor");
    }
    //Mot method trong java mac dinh la virtual method
    protected void kinhdoanh(){
        tien += 80000;
        System.out.println("Tong tien hien co: " + tien);
    }
}
