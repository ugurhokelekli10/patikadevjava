import java.util.Scanner;

public class HipotenüsHesap {

    public static void main(String[] args) {

        double kenar1, kenar2, hipotenus;
        Scanner input = new Scanner(System.in);

        System.out.print("İlk kenar uzunluğunu giriniz : ");
        kenar1 = input.nextDouble();

        System.out.print("İkinci kenar uzunluğunu giriniz : ");
        kenar2 = input.nextDouble();

        hipotenus = Math.sqrt(Math.pow(kenar1, 2) + Math.pow(kenar2, 2));
        System.out.println("Hipotenüs : " + hipotenus);
    }
}
