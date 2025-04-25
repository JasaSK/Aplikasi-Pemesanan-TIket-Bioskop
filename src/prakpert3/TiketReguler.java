    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prakpert3;
import java.time.LocalDate;
/**
 *
 * @author JASA
 */
public class TiketReguler extends TiketBioskop{
    LocalDate TanggalPembelian;
    String tempatDuduk;
    
    public TiketReguler(){
        this.TanggalPembelian = LocalDate.now();
    }
    
}
