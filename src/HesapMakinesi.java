import java.util.Scanner;
public class HesapMakinesi {
    public static void main(String[] args) {
        double a, b, d = 0;
        int c;
        Scanner input = new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz : ");
        a = input.nextDouble();
        System.out.print("İkinci sayıyı giriniz : ");
        b = input.nextDouble();
        System.out.print(
                "1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme\nİşlem seçiniz : "
        );
        c = input.nextInt();
        switch (c) {
            case 1: d = a + b;
                break;
            case 2: d = a - b;
                break;
            case 3: d = a * b;
                break;
            case 4: d = a / b;
                break;
            default:
                System.out.println("Hatalı işlem girdiniz!");
                break;
        }
        System.out.println("Sonuç : " + d);
    }
}
