/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasmodul6;

/**
 *
 * @author Pavilion Gaming
 */
public class Elektronik extends Produk {
    public Elektronik(String nama, double harga) {
        super(nama, harga);
    }
    
    @Override
    public double hitungDiskon(){
        return getHarga() * 0.75;
    }
}
