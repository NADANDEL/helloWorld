import java.util.Scanner;
public class UrunIndirimi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ürünün fiyatını girin: ");
        double urunFiyati = scanner.nextDouble();

        System.out.print("İndirim yüzdesini girin: ");
        double indirimYuzdesi = scanner.nextDouble();

        if (indirimYuzdesi < 0 || indirimYuzdesi > 100) {
            System.out.println("Geçersiz indirim yüzdesi!");
            return;
        }

        // İndirimli fiyatı hesapla
        double indirimliFiyat = urunFiyati - (urunFiyati * (indirimYuzdesi / 100));

        System.out.println("İndirimli fiyat: " + indirimliFiyat);
    }
}
