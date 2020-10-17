/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119053.latihan4.kambing;

/**
 *
 * @author Dean
 * Nama  : Dean Ghifari Faturrahman
 * Kelas : PBOIF2
 * NIM   : 10119053
 * Deskripsi Program : Program ini berisi program untuk menampilkan jumlah kambing
 */
public class PBOIF210119053Latihan4Kambing {

    public void tambahKambing() {
        // Deklarasi variabel lokal
        int jumlahKambing = 0;
        
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah Kambing setelah ditambah: " + jumlahKambing);
    }
            
    public static void main(String[] args) {
        // TODO code application logic here
        PBOIF210119053Latihan4Kambing kambingJantan = new PBOIF210119053Latihan4Kambing();
        kambingJantan.tambahKambing();
    }
    
}
