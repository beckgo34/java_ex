package ch10_class.ex08;

public class BookMain {

    public static void main(String[] args) {
        Book book = new Book();
//        book.bookTitle = "책재목";
        book.setBookTitle("책제목1");
        String title = book.getBookTitle();
        System.out.println("title = " + title);

        System.out.println(book.getBookTitle());

        book.setBookAuthor("저자");
        System.out.println(book.getBookAuthor());
    }
}
