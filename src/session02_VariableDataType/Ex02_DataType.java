package session02_VariableDataType;

public class Ex02_DataType {
    public static void main(String[] args) {
        long kieuLong1, kieuLong2;
        kieuLong1 = 123_456; //123456
        kieuLong2 = 234_567L;

        float kieuFloat = 123.45F;
        String myFormat = String.format("%d, %d, %.2f", kieuLong1, kieuLong2, kieuFloat);
        System.out.println(myFormat);
        
    }
}
