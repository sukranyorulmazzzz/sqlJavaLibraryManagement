
package oraclejava.library;

public class Books {
    private int bookId;
    private String bookName;
    private String bookAuthor;
    private String description;
    private String yearOfPub;
    private Double price;
    private String publisher;
    private String booktype;

    public Books(int bookId, String bookName, String bookAuthor, String description, String yearOfPub, Double price, String publisher, String booktype) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.description = description;
        this.yearOfPub = yearOfPub;
        this.price = price;
        this.publisher = publisher;
        this.booktype=booktype;
               
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getYearOfPub() {
        return yearOfPub;
    }

    public void setYearOfPub(String yearOfPub) {
        this.yearOfPub = yearOfPub;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

 
    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getBooktype() {
        return booktype;
    }

    public void setBooktype(String booktype) {
        this.booktype = booktype;
    }
    
    
}
