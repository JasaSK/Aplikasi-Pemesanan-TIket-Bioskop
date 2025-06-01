/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prakpert9;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== PEMESANAN TIKET BIOSKOP ===");
        System.out.print("Jenis Tiket (Reguler/VIP): ");
        String jenisTiket = input.nextLine();

        System.out.print("Judul Film: ");
        String judul = input.nextLine();

        if (judul.trim().isEmpty()) {
            System.out.println("Judul film tidak boleh kosong!");
            return;
        }

        System.out.print("Harga Tiket: ");
        String hargaInput = input.nextLine();
        System.out.print("Jumlah Tiket: ");
        String jumlahInput = input.nextLine();

        int harga, jumlah;
        try {
            harga = Integer.parseInt(hargaInput);
            jumlah = Integer.parseInt(jumlahInput);

            if (harga <= 0 || jumlah <= 0) {
                System.out.println("Harga dan jumlah harus lebih dari 0");
                return;
            }
        } catch (NumberFormatException e) {
            System.out.println("Input harga dan jumlah harus berupa angka!");
            return;
        }

        TiketBioskop tiket;

        if (jenisTiket.equalsIgnoreCase("VIP")) {
            tiket = new TiketVIP();
        } else {
            tiket = new TiketReguler();
        }

        tiket.setJudulFilm(judul);
        tiket.setHarga(harga);
        tiket.setJumlah(jumlah);

        System.out.print("Metode Pembayaran (Tunai/Kartu Kredit): ");
        String metode = input.nextLine();
        System.out.print("Jumlah Pembayaran: ");
        int bayar;
        try {
            bayar = Integer.parseInt(input.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Jumlah pembayaran harus berupa angka!");
            return;
        }

        System.out.println("\n=== DETAIL PEMESANAN ===");
        System.out.println("Judul Film: " + tiket.getJudulFilm());
        System.out.println("Jumlah Tiket: " + tiket.getJumlah());
        System.out.println("Harga per Tiket: Rp." + tiket.getHarga());
        System.out.println("Total Harga: Rp." + tiket.totalHarga());
        System.out.println("Diskon: Rp." + tiket.Diskon());
        System.out.println("Total Setelah Diskon: Rp." + tiket.HargaSetelahDiskon());
        System.out.println("Metode Pembayaran: " + metode);
        System.out.println("Jumlah Dibayar: Rp." + bayar);
        System.out.println("Status: " + tiket.bayarTiket(metode, bayar));
    }
}
