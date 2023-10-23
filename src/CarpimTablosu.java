import java.util.Scanner;

public class CarpimTablosu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Çarpım tablosu için bir tam sayı girin: ");
        int n = scanner.nextInt();

        for (int satir = 1; satir <= n; satir++) {
            for (int sutun = 1; sutun <= n; sutun++) {
                int carpim = satir * sutun;
                System.out.print(satir + "x" + sutun + "=" + carpim + "\t");
            }
            System.out.println();
        }
    }
}