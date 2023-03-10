package session12_TheEnd;
@FunctionalInterface
interface Calculator{
        int cal(int n, int m);
}
interface Message {
        void display(String message);
}

public class Ex03_LamdaExpression {
    int test(int a, int b, Calculator calculator) {
        return calculator.cal(a, b);
    }
    //(argument-list) -> {body}
    public static void main(String[] args) {
        Ex03_LamdaExpression one = new Ex03_LamdaExpression();
        //  Without parenthesis
        Message first = mes -> System.out.println(mes);
        first.display("Without parenthesis");
        //  With parenthesis
        Message second = (mes) -> System.out.println(mes);
        second.display("With parenthesis");
        //  Without type declaration
        Calculator add = (n, m) -> n + m;
        System.out.println("20 + 10 = " + one.test(20, 10, add));
        //  With type declaration
        Calculator sub = (int n, int m) -> n - m;
        System.out.println("20 - 10 = " + one.test(20, 10, sub));
        //  Without return statement and without curly braces
        Calculator multiple = (n, m) -> n * m;
        System.out.println("20 * 10 = " + one.test(20, 10, multiple));
        //  With return statement along with curly braces
        Calculator div = (n, m) -> { return n / m; };
        System.out.println("20 / 10 = " + one.test(20, 10, div));
    }
}
