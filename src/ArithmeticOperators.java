import java.util.Scanner;
public class ArithmeticOperators {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Birinci sayiyi girin: ");
        double numberOne = scanner.nextDouble();

        System.out.println("Ikinci sayiyi girin: ");
        double numberTwo = scanner.nextDouble();

        double toplam = numberOne + numberTwo;
        System.out.println("Toplam:" + toplam);

        double cikarma = numberOne - numberTwo;
        System.out.println("Cikarma:" + cikarma);

        double carpma = numberOne * numberTwo;
        System.out.println("Carpim:" + carpma);

        double bolme = numberOne / numberTwo;
        System.out.println("Bolme:" + bolme);

    }
}