import java.util.Scanner;

public class Reggie {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String ssnPattern = "^\\d{3}-\\d{2}-\\d{4}$";
        String ssn = SafeInput.getRegExString(in, "Enter your SSN (format: XXX-XX-XXXX)", ssnPattern);
        System.out.println("Your SSN is: " + ssn);

        String mNumberPattern = "^(M|m)\\d{5}$";
        String mNumber = SafeInput.getRegExString(in, "Enter your UC Student M number (format: MXXXXX)", mNumberPattern);
        System.out.println("Your UC Student M number is: " + mNumber);

        String menuChoicePattern = "^[OoSsVvQq]$";
        String menuChoice = SafeInput.getRegExString(in, "Enter a menu choice (O for Open, S for Save, V for View, Q for Quit)", menuChoicePattern);
        System.out.println("Your menu choice is: " + menuChoice);
    }
}