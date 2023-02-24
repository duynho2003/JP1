package session05_Arrays_Strings;
public class Ex02_JavaArrays {
    public static void main(String[] args) {
        //1. Khai bao truoc khoi tao sau:
            //1.1. Khai bao
            int[] days;
            //1.2. Cap phat so phan tu
            days = new int[3];
            //1.3. Khoi tao
            days[0] = 10;
            days[1] = Integer.valueOf(20);
            days[2] = new Integer(30);

            for (int i = 0; i < days.length; i++) {
                //printf("days[%d] = %d\n", i , days[i]);
                System.out.printf("days[%d] = %d\n", i, days[i]);
            }
        //2. Khai bao va khoi tao:
        int[] months = {1, 2, 3};
        for (int i = 0; i < months.length; i++) {
             System.out.printf("months[%d] = %d\n", i, months[i]);
        }
        
        //3. Foreach
        for(int ngay: days){
            System.out.printf("+ %d ngay", ngay);
        }
    }
}
