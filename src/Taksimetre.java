import java.util.Scanner;
public class Taksimetre {

    public static void main(String[] args) {

        double init = 10, min = 20, perKm = 2.2, km, total;
        Scanner input = new Scanner(System.in);

        System.out.print("Distance(km) : ");
        km = input.nextDouble();
        total = init + km * perKm;
        System.out.println(
                "Total : "
                + Math.max(total, min)
                + " TL"
        );
    }
}
