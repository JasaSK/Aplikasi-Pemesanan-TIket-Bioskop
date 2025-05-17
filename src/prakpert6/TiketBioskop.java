/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prakpert6;


/**
 *
 * @author JASA
 */
public abstract class TiketBioskop {
    // Parent class (Super Class)
    protected String judulFilm;
    protected int harga;
    protected int jumlah;
    
    
    public String getJudulFilm(){
        return judulFilm;
    }
    
    public void setJudulFilm(String judulFilm){
        this.judulFilm = judulFilm;
    }
    
    public int getHarga(){
        return harga;
    }
    
    public void setHarga(int harga){
        this.harga = harga;
    }
    
    public int getJumlah(){
        return jumlah;
    }
    
    public void setJumlah(int jumlah){
        this.jumlah = jumlah;
    }
    
    int totalHarga(){
        return (harga * jumlah);          
    }
    
    abstract int Diskon();
    
    
    public String bayarTiket(int jumlahPembayaran) {
        if (jumlahPembayaran >= harga) {
            return "Pembayaran sukses! Kembalian: " + (jumlahPembayaran - harga);
        } else {
            return "Pembayaran gagal! Jumlah pembayaran kurang.";
        }
    }

    public String bayarTiket(String metodePembayaran, int jumlahPembayaran) {
        int total = Diskon();
        if (metodePembayaran.equalsIgnoreCase("Kartu Kredit")) {
            
            if (jumlahPembayaran >= total) {
                return "Pembayaran menggunakan Kartu Kredit sukses!";
            } else {
            return "Pembayaran gagal! Saldo anda tidak cukup.";
            }
        } 
        else if (metodePembayaran.equalsIgnoreCase("Tunai")) {
            if (jumlahPembayaran >= total) {
                return "Pembayaran tunai sukses! \n Kembalian: Rp." + (jumlahPembayaran - total);
            } else {
            return "Pembayaran gagal! Jumlah pembayaran kurang.";
            }
        }
        return "Metode Pembayaran tidak dikenal";
    }
    
    
    
    
    
}


