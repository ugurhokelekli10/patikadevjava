import java.util.Scanner;

public class RecursiveCalisma {

    static void decrementAndIncrement(int n) {
        if (n <= 0) {
            System.out.print(n + " ");
            return;
        }
        System.out.print(n + " ");
        decrementAndIncrement(n - 5);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = input.nextInt();
        decrementAndIncrement(n);
    }
}
