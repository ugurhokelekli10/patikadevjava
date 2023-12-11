import java.util.Scanner;

public class CinZodyagi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your birth year: ");
        int birthYear = scanner.nextInt();

        scanner.close();

        String[] zodiacSigns = {
                "Monkey", "Rooster", "Dog", "Pig",
                "Rat", "Ox", "Tiger", "Rabbit",
                "Dragon", "Snake", "Horse", "Sheep"
        };

        int index = birthYear % 12;
        String zodiac = zodiacSigns[index];

        System.out.println("Your Chinese Zodiac sign is: " + zodiac);
    }
}
