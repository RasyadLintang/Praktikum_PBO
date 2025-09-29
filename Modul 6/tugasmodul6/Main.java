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
public class Main {
    public static void main(String[] args) {
        List<Produk> produkList = new ArrayList<>();
        produkList.add(new Buku("Cayo Perico Heist Guide Book", 100000));
        produkList.add(new Elektronik("Monitor Asus ROG Swift", 18899000));
        produkList.add(new Pakaian("Sepatu Puma Palermo", 1599000));

        KeranjangBelanja keranjang = new KeranjangBelanja(produkList);

        System.out.println("Keranjang Belanja:");
        keranjang.displayKeranjang();
    }
}
