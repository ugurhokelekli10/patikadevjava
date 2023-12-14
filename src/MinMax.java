import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Kaç tane sayı gireceksiniz : ");
        int count = input.nextInt();

        int n = 1;
        int min = 0;
        int max = 0;

        if (count > 0) {
            do {
                System.out.print(n + ". sayıyı giriniz : ");
                int num = input.nextInt();

                if (n == 1) {
                    max = min = num;
                } else {
                    if (num >= max) {
                        max = num;
                    }
                    if (num <= min) {
                        min = num;
                    }
                }
                n++;
            } while (n <= count);

            System.out.println("Max : " + max);
            System.out.println("Min : " + min);
        } else {
            System.out.println("Lütfen pozitif bir sayı giriniz.");
        }
    }
}
