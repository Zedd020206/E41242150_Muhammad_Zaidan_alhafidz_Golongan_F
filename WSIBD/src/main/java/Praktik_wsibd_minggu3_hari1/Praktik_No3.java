package Praktik_wsibd_minggu3_hari1;
import java.util.Scanner;
public class Praktik_No3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        System.out.print("Masukkan jumlah baris: ");
        n = scanner.nextInt();

        System.out.println("Menggunakan loop for:");
        for (int i = n; i >= 1; i--) {
            // Mencetak spasi
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("Menggunakan loop do-while:");
        int i = n;
        do {
            int j = 1;
            while (j <= n - i) {
                System.out.print(" ");
                j++;
            }

            j = 1;
            while (j <= (2 * i - 1)) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i--;
        } while (i >= 1);

        scanner.close();
    }
}