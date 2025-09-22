/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasmodul5;

/**
 *
 * @author Pavilion Gaming
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Kucing");
        Kucing kucing = new Kucing();
        kucing.nama = "Blue";
        kucing.jenis = "Ashera";
        kucing.suara = "Meow";
        kucing.displayInfo();
        
        System.out.println("\nAnjing");
        Anjing anjing = new Anjing();
        anjing.nama = "Chop";
        anjing.jenis = "Rottweiler";
        anjing.suara = "Woof";
        anjing.displayInfo();
    }
}
