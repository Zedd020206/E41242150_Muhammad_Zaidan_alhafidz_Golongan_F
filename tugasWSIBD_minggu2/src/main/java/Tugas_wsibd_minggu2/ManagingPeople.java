/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas_wsibd_minggu2;

class Person {
    private String nama;
    private int umur;

    public Person() {
        this.nama = "";
        this.umur = 0;
    }

    public Person(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    public String getNama() {
        return nama;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }
}

public class ManagingPeople {
    public static void main(String[] args) {
        Person p1 = new Person("Arial", 37);
        Person p2 = new Person("Joseph", 15);

        if (p1.getUmur() == p2.getUmur()) {
            System.out.println(p1.getNama() + " memiliki usia yang sama dengan " + p2.getNama());
        } else {
            System.out.println(p1.getNama() + " TIDAK memiliki usia yang sama dengan " + p2.getNama());
        }
    }
}