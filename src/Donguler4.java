import java.util.Scanner;
public class Donguler4 {
    public static void main(String[] args) {
        int n, r;
        Scanner input = new Scanner(System.in);
        System.out.print("n : ");
        n = input.nextInt();
        System.out.print("r : ");
        r = input.nextInt();

        double result = 1;
        for (int i = 1; i <= r; i++) {
            result *= n--;
            result /= i;
        }
        System.out.println("Result : " + result);
    }
}
