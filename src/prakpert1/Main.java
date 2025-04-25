/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prakpert1;

/**
 *
 * @author JASA
 */
public class Main {
    public static void main(String[] args) {
        TiketBioskop tiket = new TiketBioskop();

        // Data langsung dimasukkan (tanpa input)
        tiket.dataNamaFilm("Avengers: Endgame");
        tiket.dataJumlahTiket("6");
        tiket.dataHargaTiket("50000");

        // Menampilkan hasil
        System.out.println("==== Data Tiket ====");
        System.out.println("Film        : " + tiket.cetakFilm());
        System.out.println("Jumlah      : " + tiket.cetakJumlah());
        System.out.println("Harga Satuan: Rp " + tiket.cetakHarga());
        System.out.println("Total Harga : Rp " + tiket.hitungTotalHarga());
        System.out.println("Harga Setelah Diskon: Rp " + tiket.hitungDiskon());
    }
}
