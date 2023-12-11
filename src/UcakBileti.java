import java.util.Scanner;

public class UcakBileti {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Mesafe (KM) : ");
        int mesafe = scanner.nextInt();

        System.out.print("Yaşınız : ");
        int yas = scanner.nextInt();

        System.out.print("Yolculuk Tipi (1: Tek Yön, 2: Gidiş-Dönüş) : ");
        int yolculukTipi = scanner.nextInt();

        scanner.close();

        if (mesafe <= 0 || yas <= 0 || (yolculukTipi != 1 && yolculukTipi != 2)) {
            System.out.println("Hatalı Veri Girdiniz!");
            return;
        }

        double fiyat = mesafe * 0.10;

        if (yas < 12) {
            fiyat *= 0.5; // %50 indirim
        } else if (yas <= 24) {
            fiyat *= 0.9; // %10 indirim
        } else if (yas >= 65) {
            fiyat *= 0.7; // %30 indirim
        }

        if (yolculukTipi == 2) {
            fiyat *= 0.8; // %20 indirim
        }

        System.out.println("Toplam Tutar : " + fiyat);
    }
}
