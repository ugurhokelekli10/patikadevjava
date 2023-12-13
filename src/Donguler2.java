import java.util.Scanner;
public class Donguler2 {
    public static void main(String[] args) {
        int total = 0, k;
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Bir sayı giriniz : ");
            k = input.nextInt();
            if (k % 2 == 0 || k % 4 == 0) {
                total += k;
            }
        } while (k % 2 == 0);
        System.out.println("Total : " + total);
    }
}
