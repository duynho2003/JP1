package session04_Classes_Objects;
import session04_Classes_Objects.outsidePackage.PhongHop;

public class Ex03_PhongHoc {
    public String nuocUong = "Nuoc tinh khiet";
    private String mayIn = "Canon";
    //Default Access Specifier (Modifier)
    String sofa ="Ghe dai";
    
    public static void main(String[] args) {
        
        //1. Truy xuat cung lop
        var sinhvien = new Ex03_PhongHoc();
        
        System.out.println(sinhvien.nuocUong);
        System.out.println(sinhvien.mayIn);
        System.out.println(sinhvien.sofa);
        
        //2. Truy xuat ngoai lop
        var staff = new Ex04_PhongGV();
        
        System.out.println(staff.water);
//        System.out.println(staff.printer); //printer has private access in session04_Classes_Objects.Ex04_PhongGV at session04_Classes_Objects.Ex03_PhongHoc.main(Ex03_PhongHoc.java:1)
        System.out.println(staff.computer);
        
        //3. Truy xuat ngoai goi
        var person = new PhongHop();
        
        System.out.println(person.coke);
//        System.out.println(person.scanner);
//        System.out.println(person.laptop);
    }
}
