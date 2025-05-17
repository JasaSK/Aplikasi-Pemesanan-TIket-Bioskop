    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prakpert6;

import java.time.LocalDate;
/**
 *
 * @author JASA
 */
public class TiketReguler extends TiketBioskop{
    LocalDate TanggalPembelian;
    private String tempatDuduk;
    
    public TiketReguler(){
        this.TanggalPembelian = LocalDate.now();
    }
    
    public String getTempatDuduk(){
        return tempatDuduk;
    }
    
    public void setTempatDuduk(String tempatDuduk){
        this.tempatDuduk = tempatDuduk;
    }
    @Override
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
