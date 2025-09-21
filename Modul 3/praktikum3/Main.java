/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum3;

/**
 *
 * @author Pavilion Gaming
 */
public class Main {
    public static void main(String[] args) {
        Hewan kucing = new Hewan("Nekomamushi", 4);
        kucing.suara();
        kucing.info();
        kucing.berlari();
    
        Hewan anjing = new Hewan("Inuarashi", 4);
        anjing.suara();
        anjing.info();
        anjing.berlari();
    }
}
