import java.util.Scanner;
public class SinifGecme {
    public static void main(String[] args) {
        double mat, fizik, turkce, kimya, muzik, toplam = 0, dersSayisi = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunu giriniz : ");
        mat = input.nextDouble();
        System.out.print("Fizik notunu giriniz : ");
        fizik = input.nextDouble();
        System.out.print("Türkçe notunu giriniz : ");
        turkce = input.nextDouble();
        System.out.print("Kimya notunu giriniz : ");
        kimya = input.nextDouble();
        System.out.print("Müzik notunu giriniz : ");
        muzik = input.nextDouble();

        String[][] dersler = {
                {"Matematik", String.valueOf(mat)},
                {"Fizik", String.valueOf(fizik)},
                {"Türkçe", String.valueOf(turkce)},
                {"Kimya", String.valueOf(kimya)},
                {"Müzik", String.valueOf(muzik)}
        };

        for (String[] ders : dersler) {
            if (Double.parseDouble(ders[1]) < 0 || Double.parseDouble(ders[1]) > 100) {
                System.out.println(ders[0] + " notu 0-100 arasında olmalıdır.");
                System.exit(1);
            } else {
                toplam += Double.parseDouble(ders[1]);
                dersSayisi++;
            }
        }

        double ortalama = toplam / dersSayisi;
        if (ortalama >= 55) {
            System.out.println("Ortalamanız : " + ortalama);
            System.out.println("Sınıfı Geçtiniz :)");
        } else {
            System.out.println("Ortalamanız : " + ortalama);
            System.out.println("Sınıfta Kaldınız :(");
        }
    }
}
