import java.util.Scanner;
import java.util.ArrayList;

public class Siralama {
    public static void main(String[] args) {
        double a, b, c;
        Scanner i = new Scanner(System.in);
        System.out.print("1. sayı : ");
        a = i.nextDouble();
        System.out.print("2. sayı : ");
        b = i.nextDouble();
        System.out.print("3. sayı : ");
        c = i.nextDouble();

        ArrayList<Double> numbers = new ArrayList<Double>();
        numbers.add(a);
        numbers.add(b);
        numbers.add(c);

        numbers.sort(null);
        System.out.println(numbers);
    }
}
