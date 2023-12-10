import java.util.Scanner;
public class DaireHesap {
    public static void main(String[] args) {
        double r, a, c;
        Scanner i = new Scanner(System.in);
        System.out.print("Enter radius : ");
        r = i.nextDouble();
        a = Math.PI * Math.pow(r, 2);
        c = 2 * Math.PI * r;
        System.out.println("Area : " + a);
        System.out.println("Circumference : " + c);
    }
}
