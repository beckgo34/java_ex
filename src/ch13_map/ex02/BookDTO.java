package ch13_map.ex02;

public class BookDTO {
    private Long id;
    private String bookTitle;
    private String bookAutor;
    private String bookPrice;
    private String bookPubliser;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getBookAutor() {
        return bookAutor;
    }

    public void setBookAutor(String bookAutor) {
        this.bookAutor = bookAutor;
    }

    public String getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(String bookPrice) {
        this.bookPrice = bookPrice;
    }

    public String getBookPubliser() {
        return bookPubliser;
    }

    public void setBookPubliser(String bookPubliser) {
        this.bookPubliser = bookPubliser;
    }

    public BookDTO() {
    }
    private static Long idValue = 1L;
    public BookDTO(String bookTitle, String bookAutor, String bookPrice, String bookPubliser) {
        this.id = idValue++;
        this.bookTitle = bookTitle;
        this.bookAutor = bookAutor;
        this.bookPrice = bookPrice;
        this.bookPubliser = bookPubliser;
    }

    @Override
    public String toString() {
        return "BookDTO{" +
                "id=" + id +
                ", bookTitle='" + bookTitle + '\'' +
                ", bookAutor='" + bookAutor + '\'' +
                ", bookPrice='" + bookPrice + '\'' +
                ", bookPubliser='" + bookPubliser + '\'' +
                '}';
    }
}
