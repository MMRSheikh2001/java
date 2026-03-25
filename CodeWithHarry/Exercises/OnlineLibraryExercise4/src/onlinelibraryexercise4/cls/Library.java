/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package onlinelibraryexercise4.cls;

import java.util.Arrays;

/**
 *
 * @author Administrator
 */
public class Library {

    private String bookName;
    private String[] books = new String[100];
    private int bookIndex;

    public Library() {
    }

    public Library(String bookName) {
        this.bookName = bookName;
    }

    public Library(String bookName, int bookIndex) {
        this.bookName = bookName;
        this.bookIndex = bookIndex;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String[] getBooks() {
        return books;
    }

    public void setBooks(String[] books) {
        this.books = books;
    }

    public int getBookIndex() {
        return bookIndex;
    }

    public void setBookIndex(int bookIndex) {
        this.bookIndex = bookIndex;
    }

    public void addBooks() {

        books[bookIndex] = bookName.trim();
        System.out.println("You have added the book " + bookName + " to the Library at " + (bookIndex + 1) + "th Position");
        System.out.println(Arrays.toString(books));

    }

    public void issueBook() {

        boolean found = false;
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null && books[i].equalsIgnoreCase(bookName)) {
                bookIndex = i;
                found = true;
                break;
            }

        }
        if (found == false) {
            System.out.println("Book Not available/Found");
            bookIndex = 99;

        }
        System.out.println("Here's the book \nname : " + books[bookIndex]);
        // Updating After Giving book

        books[bookIndex] = "borrowed";
        System.out.println(Arrays.toString(books));

    }

    public void returnBook() {
        boolean found = false;
        for (int i = 0; i < books.length; i++) {
            if (books[i].equalsIgnoreCase("borrowed")) {
                found = true;
                bookIndex = i;
                break;

            }

        }
        if (found == false) {
            System.out.println("No Book as this was Borrowed ");
        }

        //updating
        books[bookIndex] = bookName;
        System.out.println(Arrays.toString(books));

    }

    public String[] showAvailableBooks() {
        System.out.println(Arrays.toString(books));
        return books;

    }

}
