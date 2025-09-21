/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4;

/**
 *
 * @author Pavilion Gaming
 */
public class Main {
    public static void main(String[] args) {
        Mobil Car1 = new Mobil("BMW M3 E46", 250, "Bensin", 4);
        Mobil Car2 = new Mobil("Civic Ferio", 200, "Bensin", 4);
        
        System.out.println("Data Mobil 1");
        Car1.tampilkanInfoMobil();
        
        System.out.println("\nData Mobil 2");
        Car2.tampilkanInfoMobil();
    }
}
