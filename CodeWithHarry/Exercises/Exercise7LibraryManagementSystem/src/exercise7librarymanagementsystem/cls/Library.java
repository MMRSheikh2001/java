/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise7librarymanagementsystem.cls;

import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;

/**
 *
 * @author Administrator
 */
public class Library {
    //  HashMap<Integer, Book> bookList= new HashMap<>();

    LinkedList<Book> bookList = new LinkedList<>();

    public void addBooks(String bookName, String authorName) {

        Book b = new Book(bookName, authorName, null, null);
        bookList.add(b);
        System.out.println(b);

    }

    public void issueBook(String bookName, String issueTo) {

        Book b = new Book();
//        if ((b.getBookName()).equalsIgnoreCase(bookName) && (b.getIssuedTo()).equals(null)) {
//            System.out.println("Here's The Book : " + b.getBookName());
////            //     bookList.remove(b.getBookName());
////            int index = bookList.indexOf(b);
////            //     b= new Book(bookName, bookName, issueTo, issueDate);
////            Date d = new Date();
////            b.setIssueDate(d);
////
////            b.setIssuedTo(issueTo);
////
//        }

        boolean found = false;
        for (Book item : bookList) {
            if ((item.getBookName()).equalsIgnoreCase(bookName) && (item.getIssuedTo()).equals(null)) {
                found = true;
                System.out.println("Here's The Book : " + item.getBookName());
                int index = bookList.indexOf(item);
                b = new Book(item.getBookName(), item.getAuthorName(), issueTo, new Date());
                bookList.set(index, b);

            }

        }
        if(found==false){
            System.out.println("Book Not Available/Found");
        }

    }

}
