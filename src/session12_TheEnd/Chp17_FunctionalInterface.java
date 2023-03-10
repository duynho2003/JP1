package session12_TheEnd;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

interface TestFunctionalInterface<T, R>{
   R show(T t);
}
public class Chp17_FunctionalInterface {
    public static void main(String[] args) {
        // Apply 01
        TestFunctionalInterface<String, Integer> n;
        n = (s) -> Integer.parseInt(s);
        System.out.println(n.show("123"));
               
        // Apply 02
        TestFunctionalInterface<LocalDate, String> today;
        today = (d) -> d.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println(today.show(LocalDate.now()));
   }
}

