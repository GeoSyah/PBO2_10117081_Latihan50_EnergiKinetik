/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2_10117081_latihan50_energikinetik;

/**
 *
 * @author Geo Syah Alkautsar
 * NIM : 10117081
 * Kelas : IF2/PBO2
 * Deskripsi Program : Menghitung energi kinetik dari sebuah benda
 */
public class PBO2_10117081_Latihan50_EnergiKinetik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BolaBaseball bola = new BolaBaseball();
        bola.setMassa(145);
        bola.setKecepatan(25);
        System.out.println("1 buah baseball dengan massa\t   = " 
                + bola.getMassa() + " g");
        System.out.println("baseball dilempar dengan kecepatan = " 
                + bola.getKecepatan() + " m/s");
        
        double massa = bola.getMassa();
        double kecepatan = bola.getKecepatan();
        
        System.out.println("A. Energi Kinetik\t\t     = " + 
                bola.hitungEnergiKinetik1(massa, kecepatan));
        System.out.println("B. Usaha pada bola dari keadaan diam = " + bola.usaha());
    }
    
}
