import java.util.Scanner;

public class SafeInput {

    public static int getInt(Scanner scan, String prompt) {
        int input;
        do {
            System.out.print(prompt);
        } while (!scan.hasNextInt() || (input = scan.nextInt()) <= 0);
        scan.nextLine();
        return input;
    }

    public static double getDouble(Scanner scan, String prompt) {
        double input;
        do {
            System.out.print(prompt);
        } while (!scan.hasNextDouble() || (input = scan.nextDouble()) <= 0);
        scan.nextLine();
        return input;
    }

    public static String getNonBlankString(Scanner scan, String prompt) {
        String input;
        do {
            System.out.print(prompt);
            input = scan.nextLine();
        } while (input.trim().isEmpty());
        return input;
    }
}