/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prakpert2;

/**
 *
 * @author JASA
 */
public class TiketBioskop {
      //Attribute default
      String namaFilm; 
      int jumlahTiket, hargaTiket;
      
    public TiketBioskop(String x, int y, int z){
        namaFilm = x;
        jumlahTiket = y;
        hargaTiket = z;
        }
   
    public int hitungTotalHarga() {
    return (jumlahTiket) * (hargaTiket);
    }
    
    public int hitungDiskon() {
    int jumlah = (jumlahTiket);
    int totalHarga = hitungTotalHarga();
    double diskon = 0;
    if (jumlah >= 5) {
        diskon = 0.20; // Diskon 20%
    } else if (jumlah >= 3) {
        diskon = 0.10; // Diskon 10%  
    }
    return (int) (totalHarga - (totalHarga * diskon)); // Harga setelah diskon
}

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TiketBioskop KungfuPanda = new TiketBioskop("Kungfu Panda", 2, 70000);
        System.out.println("Nama FILM :" + KungfuPanda.namaFilm);
        System.out.println("Jumlah Tiket Dipesan :" + KungfuPanda.jumlahTiket);
        System.out.println("Harga Tiket :" + KungfuPanda.hargaTiket);
        System.out.println("Total Harga :" + KungfuPanda.hitungTotalHarga());
        
        if(KungfuPanda.jumlahTiket >= 5){
        System.out.println("Anda telah mendapatkan diskon 20% :" + KungfuPanda.hitungDiskon()+"\n\n");
        } 
        else if(KungfuPanda.jumlahTiket >= 3){
        System.out.println( "Anda telah mendapatkan diskon 10% :" + KungfuPanda.hitungDiskon()+"\n\n");        
        }
        else{
            System.out.println("-\n\n");
        }
          
    TiketBioskop Cars = new TiketBioskop("Cars", 7, 90000);
        System.out.println("Nama FILM :" + Cars.namaFilm);
        System.out.println("Jumlah Tiket Dipesan :" + Cars.jumlahTiket);
        System.out.println("Harga Tiket :" + Cars.hargaTiket);
        System.out.println("Total Harga :" + Cars.hitungTotalHarga());
        
        if(Cars.jumlahTiket >= 5){
        System.out.println("Anda telah mendapatkan diskon 20% :" + Cars.hitungDiskon()+"\n\n");
        } 
        else if(Cars.jumlahTiket >= 3){
        System.out.println( "Anda telah mendapatkan diskon 10% :" + Cars.hitungDiskon()+"\n\n");        
        }
        else{
            System.out.println("-\n\n");
        }
        
        TiketBioskop Batman = new TiketBioskop("The Batman", 4, 140000);
        System.out.println("Nama FILM :" + Batman.namaFilm);
        System.out.println("Jumlah Tiket Dipesan :" + Batman.jumlahTiket);
        System.out.println("Harga Tiket :" + Batman.hargaTiket);
        System.out.println("Total Harga :" + Batman.hitungTotalHarga());
        
        if(Batman.jumlahTiket >= 5){
        System.out.println("Anda telah mendapatkan diskon 20% :" + Batman.hitungDiskon()+"\n\n");
        } 
        else if(Batman.jumlahTiket >= 3){
        System.out.println( "Anda telah mendapatkan diskon 10% :" + Batman.hitungDiskon()+"\n\n");        
        }
        else{
            System.out.println("-\n\n");
        }
}
}