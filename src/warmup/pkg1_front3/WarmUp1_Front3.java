package warmup.pkg1_front3;

public class WarmUp1_Front3 {

    public static void main(String[] args) {
        System.out.println(front3("Java"));
        System.out.println(front3("Chocolate"));
        System.out.println(front3("abc"));
        System.out.println(front3("a"));
        System.out.println(front3("ab"));
    }

    public static String front3(String str) {
        if (str.length() < 3) {
            return str + str + str;
        }
        return (str.substring(0, 3)) + str.substring(0, 3)+ str.substring(0, 3);
    }

}
