import java.util.Scanner;
public class RecursiveAsalSayi {
    public static int asalSayi(int n, int i) {
        if (i == 1) {
            return 1;
        } else if (n % i == 0) {
            return 0;
        }
        return asalSayi(n, i - 1);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = input.nextInt();
        if (asalSayi(n, n / 2) == 1) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
        }
    }
}

    /*
       Enter a number : 7
         n = 7, i = 3
            n = 7, i = 2
                n = 7, i = 1
                    return 1
                return 1
            return 1
        return 1
        7 is a prime number.

        Enter a number : 8
         n = 8, i = 4
            n = 8, i = 3
                n = 8, i = 2
                    n = 8, i = 1
                        return 0
                    return 0
                return 0
            return 0
        return 0
        8 is not a prime number.
    */
