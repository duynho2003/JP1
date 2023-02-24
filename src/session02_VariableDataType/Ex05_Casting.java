package session02_VariableDataType;

public class Ex05_Casting {
    public static void main(String[] args) {
        int num1 = 10;
        float num2 = 20;
        
        //Implicit
        String formatImplicit = String.format("%d + %.2f = %.2f", num1, num2, num1 + num2);
        System.out.println(formatImplicit);
        
        //Explicit
        String formatExplicit = String.format("%d + %.2f = %d", num1, num2, num1 + (int)num2);
        System.out.println(formatExplicit);
    }
}
