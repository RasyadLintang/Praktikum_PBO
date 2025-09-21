/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasmodul4;

/**
 *
 * @author Pavilion Gaming
 */
public class Main {
    public static void main(String[] args) {
        Pekerja FourBlood = new Pekerja("Jane Elisha", 27 ,"Hood President", 20000000);
        
        System.out.println("Informasi Pekerja:");
        System.out.println(FourBlood.toString());
        
        FourBlood.setNama("Nahmier Davies");
        System.out.println("\nInformasi setelah diperbarui:");
        System.out.println(FourBlood.toString());
    }
}
