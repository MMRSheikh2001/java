/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise7librarymanagementsystem.cls;

import java.util.Date;

/**
 *
 * @author Admin
 */
public class Book {
    //1.book name 2.Author name 3.Issue to 4.Issue on

    private String bookName;
    private String authorName;
    private String issuedTo;
    private Date issueDate;

    public Book() {
    }

    public Book(String bookName, String authorName, String issuedTo, Date issueDate) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.issuedTo = issuedTo;
        this.issueDate = issueDate;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getIssuedTo() {
        return issuedTo;
    }

    public void setIssuedTo(String issuedTo) {
        this.issuedTo = issuedTo;
    }

    public Date getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(Date issueDate) {
        this.issueDate = issueDate;
    }

    @Override
    public String toString() {
        return "Book{" + "bookName=" + bookName + ", authorName=" + authorName + ", issuedTo=" + issuedTo + ", issueDate=" + issueDate + '}';
    }

}
