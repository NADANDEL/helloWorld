
import java.util.Scanner;

public class CheckTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir sayi girin: ");
        double sayi = scanner.nextDouble();

        if (sayi > 0) {
            System.out.println("Sayi pozitif bir sayi");
        } else if (sayi < 0) {
            System.out.println("Sayi negatif bir sayi");
        } else {
            System.out.println("Sayi sifira esit");
        }
    }
}
