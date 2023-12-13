import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        String username, password;
        Scanner input = new Scanner(System.in);
        int right = 3;
        double balance = 1500;
        int select;
        while (right > 0) {
            System.out.print("Kullanıcı adınızı giriniz: ");
            username = input.nextLine();
            System.out.print("Şifrenizi giriniz: ");
            password = input.nextLine();
            if (username.equals("patika") && password.equals("dev123")) {
                System.out.println("Merhaba, " + username + ". Kodluyoruz Bankası'na Hoşgeldiniz.");
                do {
                    System.out.println(
                            "1- Para Yatırma\n2- Para Çekme\n3- Bakiye Sorgulama\n4- Çıkış Yap"
                    );
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                    select = input.nextInt();
                    switch (select) {
                        case 1:
                            System.out.print("Yatırılacak para miktarı : ");
                            double depositAmount = input.nextDouble();
                            balance += depositAmount;
                            break;
                        case 2:
                            System.out.print("Çekilecek para miktarı : ");
                            double withdrawAmount = input.nextDouble();
                            if (withdrawAmount > balance) {
                                System.out.println("Bakiye yetersiz.");
                            } else {
                                balance -= withdrawAmount;
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz : " + balance);
                            break;
                        case 4:
                            System.out.println("Tekrar Görüşmek Üzere !");
                            break;
                        default:
                            System.out.println("Geçersiz bir seçenek girdiniz.");
                    }
                } while (select != 4);
                break;
            } else {
                right--;
                if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur. Lütfen banka ile iletişime geçiniz.");
                } else {
                    System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
                }
            }
        }
    }
}
