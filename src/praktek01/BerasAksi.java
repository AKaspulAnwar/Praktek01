/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktek01;

/**
 *
 * @author user
 */
public class BerasAksi {
    public static void main(String[] args) {
        Beras Siam  = new Beras();
        Beras Jawa  = new Beras();
        Beras Ketan = new Beras();
        
        Siam.ukuran   = "Kurus Agak Panjang";
        Siam.warna    = "Putih Bening";
        Siam.hasil    = "Karau";
        Siam.bau      = "Harum";
        Siam.kadarair = "Sedikit";
        
        Jawa.ukuran   = "Gemuk";
        Jawa.warna    = "Agak Keruh";
        Jawa.hasil    = "Agak Lengkat/Pulen";
        Jawa.bau      = "Harum";
        Jawa.kadarair = "Agak Banyak";
        
        Ketan.ukuran   = "Gemuk";
        Ketan.warna    = "Putih Susu";
        Ketan.hasil    = "Lengket";
        Ketan.bau      = "Wangi Khas";
        Ketan.kadarair = "Sedikit";
        
        Siam.cetakinfo();
        System.out.println();
        Jawa.cetakinfo();
        System.out.println();
        Ketan.cetakinfo();
                
        
    }
}
