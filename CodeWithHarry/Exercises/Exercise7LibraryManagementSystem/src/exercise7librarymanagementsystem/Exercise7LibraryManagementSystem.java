/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercise7librarymanagementsystem;

import exercise7librarymanagementsystem.cls.Book;
import exercise7librarymanagementsystem.cls.Library;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Exercise7LibraryManagementSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Issue Books to Students
        //Book should Have info like
        //1.book name 2.Author name 3.Issue to 4.Issue on
        //infinite loop
        //user should be able to add books, return books,Issue books
        //assume all the users are registered in centered database
        //
        //
//        Date d= new Date();
//        System.out.println(d);

        Library l = new Library();
        Book b;

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome.\nWhat task do you want to do?"
                + "\n1 : Add Book"
                + "\n2 : Issue Book"
                + "\n3 : Return Book"
                + "\n4 : Show BookList"
                + "\n5 : Cancel");
        int n = sc.nextInt();
        while (n != 5) {
            if (n == 1) {
                sc.nextLine();
                System.out.println("What is the Name of the Book?");
                String bookName = sc.nextLine();
                bookName = bookName.trim();
                System.out.println("What is the Name of the Book's Author?");
                String author = sc.nextLine();
                author = author.trim();

                l.addBooks(bookName, author);
                System.out.println("What task do you want to do?"
                        + "\n1 : Add Book"
                        + "\n2 : Issue Book"
                        + "\n3 : Return Book"
                        + "\n4 : Show BookList"
                        + "\n5 : Cancel");
                n = sc.nextInt();

            }
            if (n == 2) {
                sc.nextLine();
                System.out.println("What Book do you want to Issue?");
                String bookName = sc.nextLine();
                bookName = bookName.trim();
                System.out.println("Who do you want to issue the book to");
                String issuee = sc.nextLine();
                issuee = issuee.trim();

                l.issueBook(bookName, issuee);
                System.out.println("What task do you want to do?"
                        + "\n1 : Add Book"
                        + "\n2 : Issue Book"
                        + "\n3 : Return Book"
                        + "\n4 : Show BookList"
                        + "\n5 : Cancel");
                n = sc.nextInt();

            }
            if (n == 3) {
                sc.nextLine();
                System.out.println("What Book do you want to Return?");
                String bookName = sc.nextLine();
                bookName = bookName.trim();
                System.out.println("To Whom did you issue the book to?");
                String issuee = sc.nextLine();
                issuee = issuee.trim();

                l.returnBook(bookName, issuee);
                System.out.println("What task do you want to do?"
                        + "\n1 : Add Book"
                        + "\n2 : Issue Book"
                        + "\n3 : Return Book"
                        + "\n4 : Show BookList"
                        + "\n5 : Cancel");
                n = sc.nextInt();

            }
            if (n == 4) {

                l.showBookList();
                System.out.println("What task do you want to do?"
                        + "\n1 : Add Book"
                        + "\n2 : Issue Book"
                        + "\n3 : Return Book"
                        + "\n4 : Show BookList"
                        + "\n5 : Cancel");
                n = sc.nextInt();

            }

        }

    }

}
