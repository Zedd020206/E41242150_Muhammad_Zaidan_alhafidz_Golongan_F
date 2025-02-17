package Tugas_wsibd_minggu2_hari2;
import java.util.Scanner;

public class Tugas_No2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("CAFE CERIA" + "\n"
                + "ANEKA MINUMAN" + "\n"
                + "1. Soft drinks" + "\n"
                + "2. Mix juice" + "\n"
                + "3. Nescafe" + "\n"
                + "4. Soda milk" + "\n"
                + "5. Tea" + "\n");

        System.out.print("Masukan Nama Pembeli: ");
        String nama = sc.nextLine();

        System.out.print("Silahkan Masukan Pilihan Anda: ");
        int pilihan = sc.nextInt();

        String tambahan = "Tambahan pesanan anda akan segera kami antar" + "\n"
                + "Terima Kasih " + nama
                + " Telah Berkunjung di Cafe Ceria";

        switch (pilihan) {
            case 1:
                System.out.println("Minuman yang anda pesan adalah Soft drinks" + "\n" + tambahan);
                break;
            case 2:
                System.out.println("Minuman yang anda pesan adalah Mix juice" + "\n" + tambahan);
                break;
            case 3:
                System.out.println("Minuman yang anda pesan adalah Nescafe" + "\n" + tambahan);
                break;
            case 4:
                System.out.println("Minuman yang anda pesan adalah Soda milk" + "\n" + tambahan);
                break;
            case 5:
                System.out.println("Minuman yang anda pesan adalah Tea" + "\n" + tambahan);
                break;
            default:
                System.out.println("Pilihan tidak tersedia");
                break;
        }
    }
}