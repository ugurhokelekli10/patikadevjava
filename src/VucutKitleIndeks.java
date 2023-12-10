import java.util.Scanner;
public class VucutKitleIndeks {
    public static void main(String[] args) {
        double h, w, bmi;
        Scanner i = new Scanner(System.in);
        System.out.print("Height(m) : ");
        h = i.nextDouble();
        System.out.print("Weight(kg) : ");
        w = i.nextDouble();
        bmi = w / Math.pow(h, 2);
        System.out.println("Body Mass Index : " + bmi);
    }
}
