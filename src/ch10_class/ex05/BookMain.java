package ch10_class.ex05;

import java.util.Arrays;

public class BookMain {

    public static void main(String[] args) {
        // 책 정보는 시중에 있는 실제 책으로 해봅시다.

        // 기본생성자로 객체 만들고 필드값 채우기
        Book book = new Book();
        book.bookTile = "우연의 음악";
        book.bookAuthor = "폴 오스터";
        book.bookPublisher = "열린책들";
        book.isbn = "893290278X";
        book.bookPrice = 9720;
        System.out.println("제목: "+ book.bookTile + " 저자: " + book.bookAuthor + " 출판사: " + book.bookPublisher + " isbn: " + book.isbn + " 가격: " + book.bookPrice);
        // 매개변수 2개 있는 생성자로 객체 만들고 필드값 채우기
        Book book2 = new Book("앵무새 죽이기", "하퍼리");
        book2.bookPublisher = "열린책들";
        book2.isbn = "8932737205";
        book2.bookPrice = 14220;
        System.out.println("제목: "+ book2.bookTile + " 저자: " + book2.bookAuthor + " 출판사: " + book2.bookPublisher + " isbn: " + book2.isbn + " 가격: " + book2.bookPrice);
        //모든 배개변수 있는 생성자로 객체 만들고 필드값 채우기
        Book book3 = new Book("해변의 카프카", "무라카미 하루키", "문화사상", "8970128085", 13500);
        System.out.println("제목: "+ book3.bookTile + " 저자: " + book3.bookAuthor + " 출판사: " + book3.bookPublisher + " isbn: " + book3.isbn + " 가격: " + book3.bookPrice);
    }
}
