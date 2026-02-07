/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package feb7homeclasspractice.cubeclass;

/**
 *
 * @author Mahbub
 */
public class ElectricityBill {

    public float unitsToBeBilled;

    public double calculateBill() {
        double billAmount = 0;
        if (unitsToBeBilled <= 100) {
            billAmount = 5 * unitsToBeBilled;
        } else if (unitsToBeBilled <= 200) {
            billAmount = 5 * 100 + (unitsToBeBilled - 100) * 8;
        } else if (unitsToBeBilled > 200) {
            billAmount = 5 * 100 + 8 * 100 + (unitsToBeBilled - 200) * 10;
        } else {
            return -1;
        }

        return billAmount;
    }

}
