package Tugas_wsibd_minggu3_hari1;
import java.util.Scanner;
public class Tugas_segitigaSamaKaki_Terbalik{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        System.out.print("Masukkan jumlah baris: ");
        n = scanner.nextInt();

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
    }
}