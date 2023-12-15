package ch11_classes.ex02;

import ch11_array.ex3.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookService {
    BookRepository bookRepository = new BookRepository();
    Scanner scanner = new Scanner(System.in);

    public void sava() {
        System.out.println("도서명: ");
        String booktitle = scanner.next();
        System.out.println("저자: ");
        String bookAuthor = scanner.next();
        System.out.println("가격: ");
        String bookPrice = scanner.next();
        System.out.println("출판사: ");
        String bookPubliser = scanner.next();
        BookDTO bookDTO = new BookDTO(booktitle, bookAuthor, bookPrice, bookPubliser);
        boolean result = bookRepository.save(bookDTO);
        if (result) {
            System.out.println("등록 성공");
        } else {
            System.out.println("등록 실패");
        }

    }

    public void findAll() {
        bookRepository.findAll();
    }

    public void findById() {
        System.out.println("id입력: ");
        Long id = scanner.nextLong();
        BookDTO bookDTO = bookRepository.findById(id);
        if (bookDTO != null) {
            System.out.println("bookDTO = " + bookDTO);
        } else {
            System.out.println("조회결과가 없습니다");
        }
    }

    public void findByTitle() {
        System.out.println("도서명 입력");
        String bookTitle = scanner.next();
        BookDTO bookDTO = bookRepository.findByTitle(bookTitle);
        if (bookDTO != null) {
            System.out.println("bookDTO = " + bookDTO);
        } else {
            System.out.println("조회결과가 없습니다");
        }
    }

    public void search() {
        System.out.println("검색어: ");
        String bookTitle = scanner.next();
        List<BookDTO> bookDTOList = bookRepository.search(bookTitle);
        if (bookDTOList.size() > 0) {
            for (BookDTO bookDTO : bookDTOList) {
                System.out.println("bookDTO = " + bookDTO);
            }
        } else {
            System.out.println("검색 결과가 없습니다.");
        }
    }

    public void update() {
        // 수정할 id를 입력받음
        // 해당 id 도서가 있다면 수정할 가격을 입력받고 수정 처리
        // 없으면 없다고 출력
        System.out.println("수정할 id: ");
        Long id = scanner.nextLong();
        BookDTO bookDTO = bookRepository.findById(id);
        if (bookDTO != null) {
            System.out.println("수정할 가격: ");
            String bookPrice = scanner.next();
            boolean updateResult = bookRepository.update(id, bookPrice);
            if (updateResult) {
                System.out.println("수정 성공");
            } else {
                System.out.println("수정 실패");
            }
        } else {
            System.out.println("조회결과가 없습니다");
        }
    }

    public void delete() {
        System.out.println("삭제할 id입력: ");
        Long id = scanner.nextLong();
        boolean result = bookRepository.delete(id);
        if (result){
            System.out.println("삭제 성공");
        }else {
            System.out.println("삭제 실패");
        }
    }
}
