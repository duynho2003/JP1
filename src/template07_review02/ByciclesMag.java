package template07_review02;
import java.util.Scanner;

public class ByciclesMag {
    int max;
    int next;
    Scanner sc;
    Bycicles[] bike;

    public ByciclesMag() {
        sc = new Scanner(System.in);
        do{
            System.out.println("Enter number of bikes to management: ");
            max = Integer.parseInt(sc.nextLine());
            if(max <= 1 || max >= 100){
                System.err.println("Number must be in rank [2 - 99]");
            }
        }while(max <= 1 || max >= 100);
//        max = 2;  //Voi bai yeu cau nguoi dung nhap gia tri, sv can phat trien them
        next = 0;
        bike = new Bycicles[max];
        
    }
    
    public void addBike() throws BycicleException{
        if(next >= max){
            throw new BycicleException("Cannot add more than " + max + " bikes");
        }
        /*String model, type;
        int size; */
        //1. Khai bao Bycicles va cac attribute cua no
        //Bycicles bike; => sai
        String x, y;
        int z;
        //---------------------//
        do{
            System.out.println("Enter Bycicles model: ");
            x = sc.nextLine();
            if(x.isEmpty()){
                System.err.println("Model can not left blank!");
            }
        }while(x.isEmpty());
        //-------------
        do{
            System.out.println("Enter Bycicles type: ");
            y = sc.nextLine();
            if(y.isEmpty()){
                System.err.println("Type can not left blank!");
            }
        }while(x.isEmpty());
        //-------------
        do{
           System.out.println("Enter Bycicles size: ");
            z = Integer.parseInt(sc.nextLine());
            if(z <= 10 || z >= 20){
                System.err.println("Size must be in rank [11 - 19]");
            }
        }while(z <=10 || z >= 20);
        //---------------------//
        bike[next] = new Bycicles(x, y, z);
        next++;
    }

    public void showBikes(){
        if(next == 0){
            System.err.println("Error!");
        }
        for (int i = 0; i < next; i++) {
            System.out.println(bike[i].toString());
        }
    }
}
