import java.util.Scanner;

public class DevTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String nonZeroLenString = SafeInput.getNonZeroLenString(in, "Enter a non-zero length string");
        System.out.println("You entered: " + nonZeroLenString);

        int integer = SafeInput.getInt(in, "Enter an integer");
        System.out.println("You entered: " + integer);

        double doubleValue = SafeInput.getDouble(in, "Enter a double");
        System.out.println("You entered: " + doubleValue);

        int rangedInt = SafeInput.getRangedInt(in, "Enter a ranged integer", 1, 10);
        System.out.println("You entered: " + rangedInt);

        double rangedDouble = SafeInput.getRangedDouble(in, "Enter a ranged double", 1.0, 10.0);
        System.out.println("You entered: " + rangedDouble);

        boolean ynConfirm = SafeInput.getYNConfirm(in, "Do you confirm");
        System.out.println("Your confirmation: " + ynConfirm);

        String regExString = SafeInput.getRegExString(in, "Enter a string that matches the pattern [a-zA-Z]+", "[a-zA-Z]+");
        System.out.println("You entered: " + regExString);
    }
}