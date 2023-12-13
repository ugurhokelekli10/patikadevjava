import java.util.Scanner;
import java.util.ArrayList;

public class Donguler6 {
    public static void main(String[] args) {
        int temp, digit, digitPosition = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        temp = input.nextInt();

        ArrayList<Integer> digitsArr = new ArrayList<Integer>();
        int total = 0;
        while (temp != 0) {
            digit = temp % 10;
            total += digit;
//            digitsArr.add(0, digit);
            temp /= 10;
            digitPosition++;
        }

        System.out.println("Digits Sum : " + total);
    }
}
