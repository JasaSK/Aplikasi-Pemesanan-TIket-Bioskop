/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prakpert4;

import java.time.LocalDate;
/**
 *
 * @author JASA
 */
public class TiketVIP extends TiketBioskop{
   LocalDate TanggalPembelian;
    private String tempatDuduk;
    int jumlah;
    
    public String getTempatDuduk(){
        return tempatDuduk;
    } 
    
    public void setTempatDuduk(String tempatDuduk){
        this.tempatDuduk = tempatDuduk;
    }
    
    public TiketVIP(){
        this.TanggalPembelian = LocalDate.now();
    }
    
    int BiayaTambahan(){
       int total = totalHarga();
       total += total * 0.30; 
       return total;
    }
    
     int VipDiskon(){
        int diskon = BiayaTambahan();
       if(jumlah >= 5){
          diskon -= diskon * 0.20;
       }
       else if(jumlah >= 3){
          diskon -= diskon * 0.10; 
       }
       return diskon;
    }  
}
