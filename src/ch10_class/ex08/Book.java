package ch10_class.ex08;

public class Book {
    private String bookTitle;
    private String bookAuthor;
    private  String price;

    // bookTitle setter
    public void setBookTitle(String bookTitle){
        this.bookTitle = bookTitle;
    }

    // bookTitle getter
    public  String getBookTitle(){
        return bookTitle;
    }

    public  void setBookAuthor(String bookAuthor){
        this.bookAuthor = bookAuthor;
    }

    public String getBookAuthor(){
        return bookAuthor;
    }

}
