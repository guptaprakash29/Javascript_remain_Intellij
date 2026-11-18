public class SwitchConditionalStatement {
    static void main(String[] args) {
   /*     if (false) {
            System.out.println("Great! You Like Eating Apples. ");
        } else if (false) {
            System.out.println("Great! You Like Eating Mango. ");

        } else if (false) {
            System.out.println("Great! You Like Eating Orange. ");

        } else {
            System.out.println("So,You Don't Like Eating Apple Mango Banana. ");

        }

    */
        String fruits = "Potato";
        switch (fruits) {
            case "Apple":
                System.out.println("Great! You Like Eating Apple. ");
                break;

            case "Mango":
                System.out.println("Great! You Like Eating Mango. ");
                break;
            case "Orange":
                System.out.println("Great! You Like Eating Orange. ");
                break;
            case "Onion":
            case "Potato":
                System.out.println("Great, You Like Eating Onion and Potato");
                break;
            default:
                System.out.println("So,You Don't Like Eating  Mango Apple Orange. ");
        }
    }
}
