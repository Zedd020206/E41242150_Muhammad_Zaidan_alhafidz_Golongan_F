package Praktik_wsibd_minggu2_hari1;

import java.util.Scanner;

public class Praktik_No4 {
     public static void main(String[] args) {
        Scanner sl = new Scanner(System.in);
        
        System.out.print("Masukkan nilai1 = ");
        int nilai1 = sl.nextInt();
        System.out.print("Masukkan nilai2 = ");
        int nilai2 = sl.nextInt();
        
        int jumlah = nilai1 + nilai2;
        System.out.println("Jumlah = " + jumlah);        
    }
    
}
