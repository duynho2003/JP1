package template02__Arrays;
public class Ex04_String {
    
    public void viewSimple() {
        String s1 = "Gan bang phep Literal";
        String s2 = "Gan bang phep Constructor";

        System.out.println(s1);
        System.out.println(s2);
    }
    public void viewSubString(){
        String s = "ABCD EFGH";
        String sub1, sub2;
        sub1 = s.substring(2);
        sub2 = s.substring(2, 6);
        System.out.println(sub1);
        System.out.println(sub2);
    }
    
    public static void main(String[] args) {
        var test = new Ex04_String();
//        test.viewSimple();
        test.viewSubString();
    }
}
