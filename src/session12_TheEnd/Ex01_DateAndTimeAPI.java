package session12_TheEnd;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Ex01_DateAndTimeAPI {
    public void testAPI(){
    LocalDateTime ldt = LocalDateTime.now();
    LocalDate hcmc = LocalDate.now(ZoneId.of("Asia/Ho_Chi_Minh"));
    LocalDate newYork = LocalDate.now(ZoneId.of("America/New_York"));
    
        System.out.println("DateTime in full format: " + ldt);
        System.out.println("Ho Chi Minh City: " + hcmc);
        System.out.println("NewYork Time = " + newYork);
        
        String time = ldt.getHour() + ":" +ldt.getMinute()+ ":" + ldt.getSecond();
        String fullTime = ldt.getDayOfWeek()+ ", " +ldt.getDayOfMonth() + " " + ldt.getMonth();
        
        System.out.println("Time: " + time);
        System.out.println(fullTime + ", " + ldt.getYear());
    }
    public static void main(String[] args) {
        new Ex01_DateAndTimeAPI().testAPI();
    }
}
