package ch11_array.ex3;

import java.util.ArrayList;
import java.util.List;

public class BookMain {
    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<>();
//        Book book = new Book();
//        Book book1 = new Book(1L,"우연의 음악","폴 오스터",9720,"열린책들");
        Book book1 = new Book();
//        book1.setId(1L);
        book1.setBookTitle("우연의 음악");
        book1.setBookAuthor("폴 오스터");
        book1.setBookPrice(9720);
        book1.setBookPublisher("열린책들");
        bookList.add(book1);

        Book book2 = new Book("해변의 카프카","무라카미 하루키",13500,"문화사상");
        bookList.add(book2);
        
        Book book3 = new Book("트렌드 코리아 2024","김난도",17000,"유노북스");
        bookList.add(book3);

        for (int i = 0; i < bookList.size(); i++) {
            System.out.println("bookList = " + bookList.get(i));
            
        }

        for (Book bo: bookList) {
            System.out.println("bo = " + bo);
        }
        //리스트의 인덱스를 불러와서 셋으로 바꿔준다
        bookList.get(0).setBookPrice(50000);
        bookList.get(1).setBookPublisher("안녕출판사");

        for (int i = 0; i < bookList.size(); i++) {
            System.out.println("bookList = " + bookList.get(i));
        }

        for (Book bo : bookList) {
            System.out.println("bo = " + bo);
        }

    }
}
