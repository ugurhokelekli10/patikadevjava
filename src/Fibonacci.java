import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("n : ");
        int n = input.nextInt();
        int a = 1;
        int b = 1;
        int c = 0;
        System.out.print(c + " " + a + " " + b + " ");
        for (int i = 1; i <= n - 2; i++) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
}
