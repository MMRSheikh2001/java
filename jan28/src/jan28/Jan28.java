package jan28;

import java.util.Scanner;

public class Jan28 {

    public static void main(String[] args) {
//        int i = (int)(Math.random() * 100);
//        
//        System.out.println(i);

//        Scanner s = new Scanner(System.in);
//        System.out.println("Give BMI");
//        float bmi = s.nextFloat();
//        if (bmi < 18.5) {
//            System.err.println("Underweight");
//        } else if (bmi < 25) {
//            System.out.println("Normal");
//        } else if (bmi < 30) {
//            System.out.println("Overweight");
//        } else {
//            System.err.println("Obese");
//        }


//        Scanner s = new Scanner(System.in);
//        System.out.println("Give number");
//        int number = s.nextInt();
//        
//        if(number % 2 == 0){
//            System.out.println("The number is Even");
//        }
//        else{
//            System.out.println("The number is Odd");
//        }

Scanner s = new Scanner(System.in);
        System.out.println("Give 1st Number");
        float numa = s.nextFloat();
        System.out.println("Give 2nd Number");
        float numb = s.nextFloat();
        double add = numa + numb;
        double min = numa - numb;
        double mul = numa * numb;
        double div = numa / numb;
        
        System.out.println("What operations do you want? The operations are + , - , x , / ");
        String oper = s.next();
        
        if(oper.equals("+")){
            System.out.println(add);
        }
        else if(oper.equals("-")){System.out.println(min);}
        else if(oper.equalsIgnoreCase("x")){System.out.println(mul);}
        else if (oper.equals("/")){System.out.println(div);}
        else{System.out.println("Invalid");}
        

    }
}
