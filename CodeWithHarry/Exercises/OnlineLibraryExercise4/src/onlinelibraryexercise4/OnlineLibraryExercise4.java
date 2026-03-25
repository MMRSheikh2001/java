/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package onlinelibraryexercise4;

import java.util.Arrays;
import java.util.Scanner;
import onlinelibraryexercise4.cls.Library;

/**
 *
 * @author Administrator
 */
public class OnlineLibraryExercise4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Library l = new Library();
        System.out.println("What Action do you want?");
        System.out.println("1 : Add Book\n2 : Issue Book\n3 : Return Book\n4 : Show Books Names\n5 : Cancel");
        int choice = sc.nextInt();
        while (choice != 5) {
            if (choice == 1) {
                sc.nextLine();
                System.out.println("What Book do you want to add?");
                String bookName = sc.nextLine();
                l.setBookName(bookName);
                System.out.println("At what Position?(Ex : 0 to 98)");
                int bookIndex = sc.nextInt();
                l.setBookIndex(bookIndex);
                l.addBooks();
                System.out.println("What Action do you want?");
                System.out.println("1 : Add Book\n2 : Issue Book\n3 : Return Book\n4 : Show Books Names\n5 : Cancel");
                choice = sc.nextInt();
            }
            if (choice == 2) {
                sc.nextLine();
                System.out.println("What Book do you want?");
                String bookName = sc.nextLine();
                l.setBookName(bookName);
                l.issueBook();
                System.out.println("What Action do you want?");
                System.out.println("1 : Add Book\n2 : Issue Book\n3 : Return Book\n4 : Show Books Names\n5 : Cancel");
                choice = sc.nextInt();

            }
            if (choice == 3) {
                sc.nextLine();
                System.out.println("What book do you want to return?");
                String bookName = sc.nextLine();
                l.setBookName(bookName);
                l.returnBook();
                System.out.println("What Action do you want?");
                System.out.println("1 : Add Book\n2 : Issue Book\n3 : Return Book\n4 : Show Books Names\n5 : Cancel");
                choice = sc.nextInt();

            }
            if (choice == 4) {
                String[] books = l.showAvailableBooks();
                System.out.println("The Books currently Avaiable are \n" + Arrays.toString(books));
                System.out.println("What Action do you want?");
                System.out.println("1 : Add Book\n2 : Issue Book\n3 : Return Book\n4 : Show Books Names\n5 : Cancel");
                choice = sc.nextInt();

            }

        }

    }

}
