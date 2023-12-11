import java.util.Scanner;

public class Burclar {
    public static void main(String[] args) {
        boolean restart;

        do {
            calculateHoroscope();
            Scanner i = new Scanner(System.in);
            System.out.print("Do you want to restart the program? (y/n) : ");
            String answer = i.nextLine();
            restart = answer.equalsIgnoreCase("y");
        } while (restart);
    }

    public static void calculateHoroscope() {
        int[][] dateRanges = {
                {1, 1, 1, 19},    // Capricorn
                {1, 20, 2, 18},   // Aquarius
                {2, 19, 3, 20},   // Pisces
                {3, 21, 4, 19},   // Aries
                {4, 20, 5, 20},   // Taurus
                {5, 21, 6, 20},   // Gemini
                {6, 21, 7, 22},   // Cancer
                {7, 23, 8, 22},   // Leo
                {8, 23, 9, 22},   // Virgo
                {9, 23, 10, 22},  // Libra
                {10, 23, 11, 21}, // Scorpio
                {11, 22, 12, 21}, // Sagittarius
                {12, 22, 12, 31}  // Capricorn
        };

        String[] horoscopes = {
                "Capricorn", "Aquarius", "Pisces", "Aries",
                "Taurus", "Gemini", "Cancer", "Leo",
                "Virgo", "Libra", "Scorpio", "Sagittarius", "Capricorn"
        };

        int month, day;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your birth month : ");
        month = scanner.nextInt();
        System.out.print("Enter your birth day : ");
        day = scanner.nextInt();

        boolean found = false;
        int i = 0;
        while (i < dateRanges.length && !found) {
            if ((month == dateRanges[i][0] && day >= dateRanges[i][1]) || (month == dateRanges[i][2] && day <= dateRanges[i][3])) {
                found = true;
                System.out.println("Your horoscope : " + horoscopes[i]);
            }
            i++;
        }

        if (!found) {
            System.out.println("Invalid date!");
        }
    }
}
