package jan28;

import java.util.Scanner;

/**
 *
 * @author Mahbub
 */
public class homeIncomeTaxCalculation {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Please indicate your Marital Condition e.g. ");
        System.out.println("1 = Single");
        System.out.println("2 = Married Filing Jointly / Qualified Widower");
        System.out.println("3 = Married Filing Separately");
        System.out.println("4 = Head of household");
        int cond = s.nextInt();

        System.out.println("Please Give your Income amount");
        float i = s.nextFloat();
        i = Math.abs(i);

        double tax;

        if (cond == 1) {
            if (i <= 8350) {
                tax = i * 0.1;
                System.out.println("Your Income tax is " + tax);
            } else if (i <= 33950) {
                tax = 8350 * 0.1 + (i - 8350) * 0.15;
                System.out.println("Your Income tax is " + tax);
            } else if (i <= 82250) {
                tax = 8350 * 0.1 + (33950 - 8350) * 0.15 + (i - 33950) * 0.25;
                System.out.println("Your Income tax is " + tax);
            } else if (i <= 171550) {
                tax = 8350 * 0.1 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (i - 82250) * 0.28;
                System.out.println("Your Income tax is " + tax);
            } else if (i <= 372950) {
                tax = 8350 * 0.1 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 + (i - 171550) * 0.33;
                System.out.println("Your Income tax is " + tax);
            } else {
                tax = 8350 * 0.1 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 + (372950 - 171550) * 0.33 + (i - 372950) * 0.35;
                System.out.println("Your Income tax is " + tax);
            }
        } else if (cond == 2) {
            if (i <= 16700) {
                tax = i * 0.1;
                System.out.println("Your Income tax is " + tax);
            } else if (i <= 67900) {
                tax = 16700 * 0.1 + (i - 16700) * 0.15;
                System.out.println("Your Income tax is " + tax);
            } else if (i <= 137050) {
                tax = 16700 * 0.1 + (67900 - 16700) * 0.15 + (i - 67900) * 0.25;
                System.out.println("Your Income tax is " + tax);
            } else if (i <= 208850) {
                tax = 16700 * 0.1 + (67900 - 16700) * 0.15 + (137050 - 67900) * 0.25 + (i - 137050) * 0.28;
                System.out.println("Your Income tax is " + tax);
            } else if (i <= 372950) {
                tax = 16700 * 0.1 + (67900 - 16700) * 0.15 + (137050 - 67900) * 0.25 + (208850 - 137050) * 0.28 + (i - 208850) * 0.33;
                System.out.println("Your Income tax is " + tax);
            } else {
                tax = 16700 * 0.1 + (67900 - 16700) * 0.15 + (137050 - 67900) * 0.25 + (208850 - 137050) * 0.28 + (372950 - 208850) * 0.33 + (i - 372950) * 0.35;
                System.out.println("Your Income tax is " + tax);
            }

        } else if (cond == 3){ 
            if (i <= 8350) {
                tax = i * 0.1;
                System.out.println("Your Income tax is " + tax);
            } else if (i <= 33950) {
                tax = 8350 * 0.1 + (i - 8350) * 0.15;
                System.out.println("Your Income tax is " + tax);
            } else if (i <= 68525) {
                tax = 8350 * 0.1 + (33950 - 8350) * 0.15 + (i - 33950) * 0.25;
                System.out.println("Your Income tax is " + tax);
            } else if (i <= 104425) {
                tax = 8350 * 0.1 + (33950 - 8350) * 0.15 + (68525 - 33950) * 0.25 + (i - 68525) * 0.28;
                System.out.println("Your Income tax is " + tax);
            } else if (i <= 186475) {
                tax = 8350 * 0.1 + (33950 - 8350) * 0.15 + (68525 - 33950) * 0.25 + (104425 - 68525) * 0.28 + (i - 104425) * 0.33;
                System.out.println("Your Income tax is " + tax);
            } else {
                tax = 8350 * 0.1 + (33950 - 8350) * 0.15 + (68525 - 33950) * 0.25 + (104425 - 68525) * 0.28 + (186475 - 104425) * 0.33 + (i - 186475) * 0.35;
                System.out.println("Your Income tax is " + tax);
            }

        } else if (cond == 4) {
            if (i <= 11950) {
                tax = i * 0.1;
                System.out.println("Your Income tax is " + tax);
            } else if (i <= 45500) {
                tax = 11950 * 0.1 + (i - 11950) * 0.15;
                System.out.println("Your Income tax is " + tax);
            } else if (i <= 117450) {
                tax = 11950 * 0.1 + (45500 - 11950) * 0.15 + (i - 45500) * 0.25;
                System.out.println("Your Income tax is " + tax);
            } else if (i <= 190200) {
                tax = 11950 * 0.1 + (45500 - 11950) * 0.15 + (117450 - 45500) * 0.25 + (i - 117450) * 0.28;
                System.out.println("Your Income tax is " + tax);
            } else if (i <= 372950) {
                tax = 11950 * 0.1 + (45500 - 11950) * 0.15 + (117450 - 45500) * 0.25 + (190200 - 117450) * 0.28 + (i - 190200) * 0.33;
                System.out.println("Your Income tax is " + tax);
            } else {
                tax = 11950 * 0.1 + (45500 - 11950) * 0.15 + (117450 - 45500) * 0.25 + (190200 - 117450) * 0.28 + (372950 - 190200) * 0.33 + (i - 372950) * 0.35;
                System.out.println("Your Income tax is " + tax);
            }
        } else {

            System.out.println("Invalid ");
        }

    }

}
