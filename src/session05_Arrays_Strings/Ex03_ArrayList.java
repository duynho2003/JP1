package session05_Arrays_Strings;
import java.util.ArrayList;

public class Ex03_ArrayList {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(10);
        list.add("Bai hat hay nhat");
        list.add(100);
        list.add(0, "Nguoi toi sau");
        
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
