package feb7homeclasspractice;

import feb7homeclasspractice.cubeclass.Cube;
import java.util.Scanner;

/**
 *
 * @author Mahbub
 */
public class Feb7homeClassPractice {

    public static void main(String[] args) {
        Cube c = new Cube();
        Scanner s = new Scanner(System.in);
        System.out.println("Give the cube length");
        c.length = s.nextFloat();
        System.out.println("The total Area of cube is " + c.getTotalArea());
        System.out.println("The volume of cube is " + c.getVolume());
    }

}
