package session01_Introduction;

public class Ex01_JavaVsCpp {

    static int giaiThua(int n) {
        if (n == 1) {
            return 1;
        }
        return n * giaiThua(n - 1);
    }

    public static void main(String[] args) {
        int n = 5;
        //scanf("%d",  & n);
        System.out.printf("! %d = %d", n, giaiThua(n));
    }
}
