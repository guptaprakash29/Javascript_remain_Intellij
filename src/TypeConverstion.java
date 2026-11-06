public class TypeConverstion {
    public static void main(String[] args) {
//        byte - short - int - long - float - double
        char ch = 'A';
        int result = ch;
        System.out.println(result); // 65

//        double a = 10.5;
//        int b = (int) a;
//
//        System.out.println(b); // 10
//        double a = 10.5;
//        float b = (float) a;
//
//        System.out.println(b); // 10.5

//        long a = 1000L;
//        int b = (int) a;
//
//        System.out.println(b); // 1000
//        int a = 130;
//        byte b = (byte) a;
//
//        System.out.println(b); // -126 Here, the value changes because byte cannot store 130.
        int a = 65;
        char b = (char) a;

        System.out.println(b); // A
    }
}
