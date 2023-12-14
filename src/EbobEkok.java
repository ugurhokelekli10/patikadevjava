import java.util.Scanner;
public class EbobEkok {
    public static void main(String[] args) {
        int n1, n2, highInt = 0, lowInt = 0, ebob = 1, ekok = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("n1 sayısını giriniz : ");
        n1 = input.nextInt();
        System.out.print("n2 sayısını giriniz : ");
        n2 = input.nextInt();
        if (n1 < n2) {
            highInt = n2;
            lowInt = n1;
        } else if (n2 < n1) {
            highInt = n1;
            lowInt = n2;
        } else {
            ebob = n1;
        }

//            for (int i = lowInt; i >= 1; i--) {
//                if (highInt % i == 0 && lowInt % i == 0) {
//                    ebob = i;
//                    break;
//                }
//            }

        int finder = lowInt;
        while (finder >= 1) {
            if (highInt % finder == 0 && lowInt % finder == 0) {
                ebob = finder;
                break;
            }
            finder--;
        }

        ekok = n1 * n2 / ebob;

        System.out.println("Ebob : " + ebob);
        System.out.println("Ekok : " + ekok);
    }
}
