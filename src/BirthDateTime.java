import java.util.Scanner;

public class BirthDateTime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int birthYear = SafeInput.getRangedInt(in, "Enter your birth year", 1950, 2015);

        int birthMonth = SafeInput.getRangedInt(in, "Enter your birth month", 1, 12);

        int birthDay;
        switch (birthMonth) {
            case 4: case 6: case 9: case 11:

                birthDay = SafeInput.getRangedInt(in, "Enter your birth day", 1, 30);
                break;
            case 2:

                birthDay = SafeInput.getRangedInt(in, "Enter your birth day", 1, 29);
                break;
            default:

                birthDay = SafeInput.getRangedInt(in, "Enter your birth day", 1, 31);
                break;
        }

        int birthHour = SafeInput.getRangedInt(in, "Enter your birth hour", 1, 24);


        int birthMinute = SafeInput.getRangedInt(in, "Enter your birth minute", 1, 59);


        System.out.printf("You were born on %d-%02d-%02d at %02d:%02d%n", birthYear, birthMonth, birthDay, birthHour, birthMinute);
    }
}