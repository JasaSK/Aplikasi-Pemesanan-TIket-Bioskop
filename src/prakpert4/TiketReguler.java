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
}
