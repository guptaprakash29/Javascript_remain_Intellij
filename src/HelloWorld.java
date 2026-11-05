public class HelloWorld {

    /*Explicit class declaration can be converted into a compact source file IntelliJ keh raha hai ki tumhari
    traditional Java class ko Java 25 ke compact source file format mein convert kiya ja sakta hai. */

    public static void main(String[] args) {

        /*Parameter 'args' is never used. args ek String array hai, jo command-line arguments receive karta hai.
        Lekin tum abhi args ka use nahi kar rahe ho, isliye IntelliJ warning dikha raha hai.*/

        System.out.println("Hello World");


    }
}