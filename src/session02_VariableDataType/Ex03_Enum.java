package session02_VariableDataType;

public class Ex03_Enum {
    enum tenHocKy{
        Spring, Summer, Fall
    }
    public static void main(String[] args) {
        var ten = tenHocKy.Spring;
        System.out.println("The name of Semester 1: " + ten);
    }
}
