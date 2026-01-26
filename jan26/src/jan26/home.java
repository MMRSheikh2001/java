package jan26;

import java.util.Scanner;

public class home {

    public static void main(String[] args) {
        
        System.out.println("Give Year");
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();
        
        if(year % 400 == 0){
            System.out.println("It is leap year");
        } else if(year % 100 != 0 && year % 4 ==0){
            System.out.println("It is also leap year");
        } else {
            System.out.println("It is not leap year");
        }
    }
}