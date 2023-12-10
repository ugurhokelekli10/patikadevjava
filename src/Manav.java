import java.util.Scanner;
public class Manav {
    public static void main(String[] args) {
        double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5, toplam = 0;
        Scanner i = new Scanner(System.in);
        System.out.println("Aldığınız ürün miktarlarını giriniz(kg)");
        System.out.print("Armut : ");
        toplam += i.nextDouble() * armut;
        System.out.print("Elma : ");
        toplam += i.nextDouble() * elma;
        System.out.print("Domates : ");
        toplam += i.nextDouble() * domates;
        System.out.print("Muz : ");
        toplam += i.nextDouble() * muz;
        System.out.print("Patlıcan : ");
        toplam += i.nextDouble() * patlican;
        System.out.println("Toplam Tutar : " + toplam + " TL ");
    }
}
