/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prakpert9;

import java.time.LocalDate;

/**
 *
 * @author JASA
 */
public class TiketVIP extends TiketBioskop {

    LocalDate TanggalPembelian;
    private String tempatDuduk;

    public String getTempatDuduk() {
        return tempatDuduk;
    }

    public void setTempatDuduk(String tempatDuduk) {
        this.tempatDuduk = tempatDuduk;
    }

    public TiketVIP() {
        this.TanggalPembelian = LocalDate.now();
    }

    int BiayaTambahan() {
        int total = super.totalHarga();
        int biayaTambahan;
        biayaTambahan = (int) (total * 0.30);
        return biayaTambahan;
    }

    @Override
    int totalHarga() {
        return super.totalHarga() + BiayaTambahan();
    }

    @Override
    int Diskon() {
        int total = totalHarga();
        int diskon = 0; 
        if (jumlah >= 5) {
            diskon = (int) (total * 0.20);
        } else if (jumlah >= 3) {
            diskon = (int) (total * 0.10);
        }
        return diskon;
    }

    @Override
    int HargaSetelahDiskon() {
        return totalHarga() - Diskon();
    }

    @Override
    public String bayarTiket(String metodePembayaran, int jumlahPembayaran) {
        int total = HargaSetelahDiskon();
        if (metodePembayaran.equalsIgnoreCase("Kartu Kredit")) {

            if (jumlahPembayaran >= total) {
                return "Pembayaran menggunakan Kartu Kredit sukses!";
            } else {
                return "Pembayaran gagal! Saldo anda tidak cukup.";
            }
        } else if (metodePembayaran.equalsIgnoreCase("Tunai")) {
            if (jumlahPembayaran >= total) {
                return "Pembayaran tunai sukses! \n Kembalian: Rp." + (jumlahPembayaran - total);
            } else {
                return "Pembayaran gagal! Jumlah pembayaran kurang.";
            }
        }
        return "Metode Pembayaran tidak dikenal";
    }
}
