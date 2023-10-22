import java.util.Scanner;

public class UserNameAndPasswordCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kullanıcı Adı: ");
        String kullaniciAdi = scanner.nextLine();

        System.out.print("Şifre: ");
        String sifre = scanner.nextLine();

        boolean sifreDogruMu = sifre.equals("123456789");
        boolean kullaniciAdiDogruMu = kullaniciAdi.equals("Ahmet");

        if (sifreDogruMu && kullaniciAdiDogruMu) {
            System.out.println("Giris basarili");
        } else {
            System.out.println("Hatali giris");
        }
        }
    }

