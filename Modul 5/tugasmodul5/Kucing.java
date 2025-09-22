/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasmodul5;

/**
 *
 * @author Pavilion Gaming
 */
class Kucing extends Hewan {
    String suara;
    
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Suara khas : " + suara);
    }
}
