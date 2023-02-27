package session07_Keywords;

public class Ex05_FinalField {
    final float pi = 3.14F;
            
    public static void main(String[] args) {
        Ex05_FinalField test = new Ex05_FinalField();
        //test.pi = 10.5; // Khong the gan gia tri cho final field
        System.out.println(test.pi);
    }
}
