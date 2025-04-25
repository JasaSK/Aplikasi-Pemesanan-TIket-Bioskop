/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prakpert3;

/**
 *
 * @author JASA
 */
public class TiketBioskop {
    // Parent class (Super Class)
    protected String judulFilm;
    protected int harga , jumlah;
    
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


