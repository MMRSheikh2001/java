
package feb2;

import java.util.Arrays;
import java.util.Scanner;


public class Feb2 {

    
    public static void main(String[] args) {
       
        Scanner s = new Scanner(System.in);
        System.out.println("How many numbers do you want to compare?");
        int n = s.nextInt();
        
        int numbers[]= new int[n];
        System.out.println("Beginning of Loop \n" + Arrays.toString(numbers));
        
        for(int i=0;i<n;i++){
            System.out.println("Give the " +(i+1)+ " th Number");
            int userInput = s.nextInt();
            numbers[i] = userInput;
        }
        System.out.println("End of Loop \n" + Arrays.toString(numbers));
//        int output = 0;
//        
//        for(int j = 0;j< n;j++){
//        if(numbers[j]<= numbers[j+1]){
//        numbers[j+1] = numbers[j];
//         output = numbers[j+1];
//        
//        }
//           
//        }
//         System.out.println("The smallest number is "+ output);
                 
        
    }
    
}
