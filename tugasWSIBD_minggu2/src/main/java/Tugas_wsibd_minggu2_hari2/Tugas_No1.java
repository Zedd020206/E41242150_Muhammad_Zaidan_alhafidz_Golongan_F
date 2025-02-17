package Tugas_wsibd_minggu2_hari2;

import java.util.Scanner;

public class Tugas_No1{

    public double hargal, harga2, harga3, harga4, hargas, total;
    public String nama;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan Nama Anda= ");
        String nama = sc.nextLine();

        System.out.print("Masukan Harga Barang 1 = ");
        double hargal = sc.nextDouble();
        System.out.print("Masukan Harga Barang 2 = ");
        double harga2 = sc.nextDouble();
        System.out.print("Masukan Harga Barang 3 = ");
        double harga3 = sc.nextDouble();
        System.out.print("Masukan Harga Barang 4 = ");
        double harga4 = sc.nextDouble();
        System.out.print("Masukan Harga Barang 5 = ");
        double hargas = sc.nextDouble();
        double total = hargal + harga2 + harga3 + harga4 + hargas;

        System.out.println("Kharisma Agung Plazza <KAP>\n" +
                "Promo Belanja Berhadiah\n" +
                "Khusus Pembelian 5 Barang Pertama\n" +
                "Dengan Harga Minimum Rp. 10000,00\n" +
                "Harga Barang ke-1: Rp. " + hargal + "\n" +
                "Harga Barang ke-2: Rp. " + harga2 + "\n" +
                "Harga Barang ke-3: Rp. " + harga3 + "\n" +
                "Harga Barang ke-4: Rp. " + harga4 + "\n" +
                "Harga Barang ke-5: Rp. " + hargas + "\n" +
                "Total Harga Pembelian Atas nama " + nama + " Dengan Total Rp. " + total + "\n");
        if (total >= 100000) {
            System.out.println("Selamat....\n" +
                    "Anda Mendapat Hadiah 1 Buah Mug Cantik\n");
        }
        System.out.println("\n" +
                "Terimakasih\n" +
                "Anda Sudah Belanja di Kharisma Agung Plazza");
    }
}