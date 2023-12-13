import java.sql.SQLOutput;
import java.util.Scanner;
public class Donguler1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        int k = input.nextInt();
        int total = 0;
        for (int i = 0; i <= k; i++) {
            if (i % 3 == 0 || i % 4 == 0) total += i;
        }
//      3'e ve 4'e bölünen sayıların toplamı
        System.out.println("Total : " + total);
    }
}
