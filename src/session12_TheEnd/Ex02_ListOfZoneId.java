package session12_TheEnd;

import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

public class Ex02_ListOfZoneId {
    static String displayTimeZone(TimeZone tz){
        
        long hours = TimeUnit.MILLISECONDS.toHours(tz.getRawOffset());
        long minutes = TimeUnit.MILLISECONDS.toMinutes(tz.getRawOffset()) 
                - TimeUnit.HOURS.toMinutes(hours);
        //avoid -4:-30 issue
        minutes = Math.abs(minutes);
        
        String result = "";
        if (hours > 0) {
            result = String.format("(GMT+%d:%02d) %s", hours, minutes, tz.getID());
        } else{
            result = String.format("(GMT%d:%02d) %s", hours, minutes, tz.getID());
        }
        return result;
    }
    
    public static void main(String[] args) {
        String[] zoneids = TimeZone.getAvailableIDs();
        System.out.println("\nTotal: " + zoneids.length + " zoneids");
        
        for (String zoneid: zoneids){
            String zone = displayTimeZone(TimeZone.getTimeZone(zoneid));
            System.out.println(zone);
        }
    }
}
