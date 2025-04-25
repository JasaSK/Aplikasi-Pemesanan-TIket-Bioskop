/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prakpert4;

/**
 *
 * @author JASA
 */
public class TiketBioskop {
    // Parent class (Super Class)
    private String judulFilm;
    private int harga;
    private int jumlah;
    
    
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
    
    int Diskon(){
        int diskon = totalHarga();
       if(jumlah >= 5){
          diskon -= diskon * 0.20;
       }
       else if(jumlah >= 3){
          diskon -= diskon * 0.10; 
       }
       return diskon;
    }  
}


