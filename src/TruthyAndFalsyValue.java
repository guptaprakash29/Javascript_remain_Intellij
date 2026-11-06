public class TruthyAndFalsyValue {
    public static void main(String[] args) {
        Boolean isActive = true;
        if (2 > 1) {
            System.out.println("If '2 > 1' Execute.");
        }
        if (isActive) {
            System.out.println("If 'isActive' Execute.");

        }
        if (isActive = true) {
            System.out.println("If 'isActive!=false' Execute.");
        } else {
            System.out.println("If Not Execute.");
        }
    }
}
