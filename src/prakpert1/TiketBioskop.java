/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prakpert1;

/**
 *
 * @author JASA
 */
// Object Class: TiketBioskop
public class TiketBioskop {
    // Atribut
    String namaFilm, jumlahTiket, hargaTiket; 
    
    void dataNamaFilm(String nama){
        this.namaFilm = nama;
    }
    void dataJumlahTiket(String jumlah){
        this.jumlahTiket = jumlah;
    }
    void dataHargaTiket(String harga){
        this.hargaTiket = harga;
    }
    String cetakFilm(){
        return namaFilm;
    }
    String cetakJumlah(){
        return jumlahTiket;
    }
    String cetakHarga(){
        return hargaTiket;
    }
    public int hitungTotalHarga() {
    return Integer.parseInt(jumlahTiket) * Integer.parseInt(hargaTiket);
    }
    
    public int hitungDiskon() {
    int jumlah = Integer.parseInt(jumlahTiket);
    int totalHarga = hitungTotalHarga();
    double diskon = 0;

    if (jumlah > 5) {
        diskon = 0.20; // Diskon 20%
    } else if (jumlah > 3) {
        diskon = 0.10; // Diskon 10%
    }

    return (int) (totalHarga - (totalHarga * diskon)); // Harga setelah diskon
}


      /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    }
    
}
