public class ConditionalStatement_Nov07_First {


    public static void main(String[] args) {
        if (true) {
            System.out.println("Both Values are Equal.");
        } else {
            System.out.println("Both Values Are Not Equal.");
        }
        boolean isSeniorCitizen = false;
        boolean isAdult = false;
        if (isSeniorCitizen) {
            System.out.println("Hello Senior Citizen.");
        } else if (isAdult) {
            System.out.println("Hello Adult Citizen.");
        } else {
            System.out.println("Hello Child>");
        }
    }
}
