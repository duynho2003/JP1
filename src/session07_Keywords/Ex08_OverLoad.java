package session07_Keywords;

public class Ex08_OverLoad {
    
    void draw(int x, int y, int r){
        String s = String.format("Hinh tron co toa do %d, %d va ban kinh %d", x, y, r);
        System.out.println(s);
    }
    
    void draw(int x, int y, int w, int h){
        String toado = String.format("+ Hinh chu nhat co toa do laf x=%d va y=%d", x, y);
        String kichthuoc = String.format("Dai w=%d va Cao h=%d", w,h);
        System.out.println(toado);
        System.out.println(kichthuoc);
    }
    
    public static void main(String[] args) {
        var student = new Ex08_OverLoad();
        student.draw(10, 20, 30);
        student.draw(10,20,30,40);
    }
}
