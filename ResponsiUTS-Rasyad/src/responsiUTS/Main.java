/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package responsiUTS;

import java.time.LocalDate;

/**
 *
 * @author Pavilion Gaming
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Elektronik");
        Elektronik laptop = new Elektronik("Monitor", 1500000, 2);
        laptop.tampilkanInfo();
        
        System.out.println("\nPegawai Tetap");
        PegawaiTetap pegawai1 = new PegawaiTetap("Rasyad", 50000000, 10000000);
        pegawai1.tampilkanInfo();
        
        System.out.println("\nMakanan");
        Makanan snack = new Makanan("Indomie", 3000, LocalDate.of(2026, 10, 16));
        snack.tampilkanInfo();
        
        System.out.println("\nPegawai Kontrak");
        PegawaiKontrak pegawai2 = new PegawaiKontrak("Andi", 3000000, 12);
        pegawai2.tampilkanInfo();
    }
}
