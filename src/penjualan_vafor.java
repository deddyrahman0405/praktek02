/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author acer
 */
public class penjualan_vafor {
    int harga_vafor;
    int jumlah_vafor;
    
    void cetakInfo(){
        System.out.println("===================");
        System.out.println("Harga vafor  :"+harga_vafor);
        System.out.println("Jumlah vafor :"+jumlah_vafor);
        System.out.println("===================");
    }
        
    int hitungPenjualan(){
            int total;
            total=harga_vafor*jumlah_vafor;
            return total;      
    }
}
