
import java.util.Scanner;
public class IfElse {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Puani giriniz.");

        int puan = scanner.nextInt();

        if (puan >= 90) {
            System.out.println("A");
        } else if (puan >= 80) {
            System.out.println("B");
        } else if (puan >= 70) {
            System.out.println("C");
        } else if (puan >= 60) {
            System.out.println("D");
        }    else {
                System.out.println("Basarisiz");
            }
        }
    }