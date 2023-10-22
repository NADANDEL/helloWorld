import java.util.Scanner;

public class UcgeninAlani {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Üçgenin taban uzunluğunu girin: ");
        double taban = scanner.nextDouble();

        System.out.print("Üçgenin yüksekliğini girin: ");
        double yukseklik = scanner.nextDouble();

        // Üçgenin alanını hesapla
        double alan = (1.0 / 2) * taban * yukseklik;

        System.out.println("Üçgenin Alanı: " + alan);
    }
}
