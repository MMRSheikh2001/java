
package feb11homepractice;

import java.util.Scanner;

/**
 *
 * @author Mahbub
 */
public class Feb11HomePractice {

   
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            for(int j=1; j<=n;j++){
                int s =(int) ((int) a + Math.pow(2, j-1) *b);
                System.out.println(s);
            }
            
            
        }
        in.close();
    }
    
}
