import java.util.Scanner;

public class Donguler1 {
    public static void main(String[] args) {
        int total = 0, count = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        int k = input.nextInt();
        for (int i = 0; i <= k; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                total += i;
                count++;
            }
        }
        double result = (count != 0) ? (double) total / count : 0;

        System.out.println("Result : " + result);
    }
}
