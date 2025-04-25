/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prakpert1;
    // Driver Class: Main

/**
 *
 * @author JASA
 */
public class CLI_Cetak {
    public static void main(String[] args) {
       TiketBioskop TB = new TiketBioskop();
       TB.dataNamaFilm("Kungfu Panda");
       TB.dataJumlahTiket("3");
       TB.dataHargaTiket("Rp.80000");
       System.out.println("Film : " + TB.cetakFilm());
       System.out.println("Jumlah : " + TB.cetakJumlah());
       System.out.println(" : " + TB.cetakHarga());
    }
}
