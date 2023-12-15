import java.util.Scanner;
public class RecursiveUsluSayi {
    static int usluSayi(int taban, int us) {
        if (us == 0) {
            return 1;
        } else if (us == 1) {
            return taban;
        }
        return taban * usluSayi(taban, us - 1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Taban değeri giriniz : ");
        int taban = input.nextInt();
        System.out.print("Üs değeri giriniz : ");
        int us = input.nextInt();
        System.out.println("Sonuç : " + usluSayi(taban, us));
    }
}
