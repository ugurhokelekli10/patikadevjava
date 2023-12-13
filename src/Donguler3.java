import java.util.Scanner;
public class Donguler3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        int k = input.nextInt();
        double p = 0;
        do {
            double n;
            for (int j = 1; j < 100; j ++) {
                if (p == 4 || p == 5) {
                    n = Math.pow(p, j);
                    if (n < k) {
                        System.out.println(n);
                    }
                }
            }
            p++;
        } while (p <= k);
    }
}
