/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasmodul3;

/**
 *
 * @author Pavilion Gaming
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Mobil 1 :");
        Mobil Car1 = new Mobil("Nissan", "Skyline GT-R R34", 1999, "White");
        Car1.displayInfo();
        Car1.startEngine();
        
        System.out.println("\nMobil 2 :");
        Mobil Car2 = new Mobil("Mazda", "RX-7 VeilSide Fortune", 1992, "Orange");
        Car2.displayInfo();
        Car2.startEngine();
        
        Car1.setWarna("White with blue stripes");
        System.out.println("\nPerubahan Warna Mobil 1");
        Car1.displayInfo();
    }
}
