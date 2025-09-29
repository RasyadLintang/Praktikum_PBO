/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasmodul6;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Pavilion Gaming
 */
public class KeranjangBelanja {
    private List<Produk> produkList;

    public KeranjangBelanja(List<Produk> produkList) {
        this.produkList = produkList;
    }

    public double hitungTotalHarga() {
        double totalHarga = 0;
        for (Produk produk : produkList) {
            totalHarga += produk.hitungDiskon();
        }
        return totalHarga;
    }

    public void displayKeranjang() {
        double totalHarga = 0;
        double totalDiskon = 0;
        for (Produk produk : produkList) {
            System.out.println("Nama: " + produk.getNama());
            double hargaAsli = produk.getHarga();
            double hargaDiskon = produk.hitungDiskon();
            double diskon = hargaAsli - hargaDiskon;
            double diskonPersen = (diskon / hargaAsli) * 100;
            System.out.println("Harga asli: " + hargaAsli);
            System.out.println("Diskon: " + diskonPersen + "%");
            System.out.println("Harga setelah diskon: " + hargaDiskon);
            System.out.println();
            totalHarga += hargaDiskon;
            totalDiskon += diskon;
        }
        System.out.println("Total harga: " + totalHarga);
        System.out.println("Total diskon: " + totalDiskon);
    }
}