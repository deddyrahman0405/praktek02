/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author acer
 */
public class penjualan_vaforaksi {
    public static void main(String[] args) {
        penjualan_vafor r1 = new penjualan_vafor();
        
        r1.harga_vafor = 900000;
        r1.jumlah_vafor = 4;
        
        r1.cetakInfo();
        System.out.println("total   =   "+r1.hitungPenjualan());
        r1.cetaktotal();
        
        penjualan_vafor r2 = new penjualan_vafor();
        r2.cetakInfo();
        penjualan_vafor r3 = new penjualan_vafor(950000,3);
        r3.cetakInfo();
    }
}
