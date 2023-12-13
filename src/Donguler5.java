import java.util.Scanner;
public class Donguler5 {
    public static void main(String[] args) {
        int n, r, t = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("n : ");
        n = input.nextInt();
        System.out.print("r : ");
        r = input.nextInt();

        for (int i = 0; i < r; i++) {
            t *= n;
        }
        System.out.println("Result : " + t);
    }
}
