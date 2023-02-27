package session07_Keywords;

public class Ex09_StaticMethod {
    static void calculator(int x, int y){
        String s = String.format("%d + %d = %d", x, y, x + y);
        System.out.println(s);
    }
    public static void main(String[] args) {
        calculator(20, 30);
    }
}
