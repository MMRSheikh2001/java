package feb14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class Feb14 {

    public static void main(String[] args) {
        try {
            PrintWriter pw = null;
            File file = new File("C:\\Users\\Admin\\Desktop\\javaPracticeFile.txt");
            try {

                pw = new PrintWriter(file);
//            pw.write("Hello Sabbir \n");
//            pw.println("From  Mahbub");

                for (int i = 1; i <= 1000; i++) {

                    pw.print(i + "\t");
                    if (i % 10 == 0) {
                        pw.print("\n");
                    }

                }
                pw.close();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Feb14.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            Scanner s = new Scanner(file);
            while (s.hasNext()) {
                System.out.println(s.nextLine());
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Feb14.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
