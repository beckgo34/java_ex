package ch13_map.ex02;


import java.util.Map;
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
        Map<Long, BookDTO> bookDTOMap = bookRepository.findAll();
        for (Long i : bookDTOMap.keySet()){
            System.out.println(bookDTOMap.get(i));
            // 도서 제목만 본다면
            System.out.println(bookDTOMap.get(i).getBookTitle());
        }
    }

    public void findById() {
        System.out.println("id입력: ");
        Long id = scanner.nextLong();
        BookDTO bookDTO = bookRepository.findId(id);
        if (bookDTO != null) {
            System.out.println("bookDTO = " + bookDTO);
        } else {
            System.out.println("조회결과가 없습니다");
        }
    }
}
