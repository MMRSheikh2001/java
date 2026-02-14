package feb14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class Feb14 {

    public static void main(String[] args) {
        PrintWriter pw = null;
        try {
            File file = new File("C:\\Users\\Admin\\Desktop\\javaPracticeFile.txt");
            pw = new PrintWriter(file);
//            pw.write("Hello Sabbir \n");
//            pw.println("From  Mahbub");

            for (int i = 1; i <= 100; i++) {

                pw.print(i + "   ");
                if (i % 10 == 0) {
                    pw.print("\n");
                }

            }
            pw.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Feb14.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
