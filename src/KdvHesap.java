import java.util.Scanner;

public class KdvHesap {

    public static void main(String[] args) {
        double kdvliFiyat, kdvsizFiyat, kdvTutari, kdvOran = 18;
        Scanner input = new Scanner(System.in);
        System.out.print("KDV'siz Fiyatı giriniz : ");

        kdvsizFiyat = input.nextDouble();
        kdvliFiyat = kdvsizFiyat * (100 + kdvOran) / 100;
        kdvTutari = kdvsizFiyat * kdvOran / 100;

        System.out.println("KDV'li Fiyat : " + kdvliFiyat);
        System.out.println("KDV Tutarı : " + kdvTutari);
    }
}
