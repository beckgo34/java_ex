package ch11_classes.ex04;

import java.util.List;
import java.util.Scanner;

public class BoardService {
        BoardRepository boardRepository = new BoardRepository();
        BoardDTO boardDTO = new BoardDTO();
        Scanner scanner = new Scanner(System.in);
    public void list() {
        System.out.print("제목: ");
        String boardTitle = scanner.next();
        System.out.print("작성자: ");
        String boardWriter = scanner.next();
        System.out.print("내용: ");
        String boardContents = scanner.next();
        System.out.print("비밀번호: ");
        String boardPass = scanner.next();
        BoardDTO boardDTO = new BoardDTO(boardTitle,boardWriter,boardContents,boardPass);
        boolean result = boardRepository.list(boardDTO);
        if (result){
            System.out.println("글작성 완료");
        }else {
            System.out.println("글작성 실패");
        }
    }

    public void findAll() {
        boardRepository.findAll();
    }

    public void findBoard() {
        System.out.print("글번호 입력: ");
        Long id = scanner.nextLong();
        // 1. 조회수를1 증가
        // 2. 상세내용 가져옴
        BoardDTO boardDTO = boardRepository.findBoard(id);
        boardDTO.findBoard(id);
        if (boardDTO != null){
            System.out.println("boardDTO = "+boardDTO);
        }else{
            System.out.println("조회결과 없음");
        }
    }

    public void update() {
        System.out.print("글번호 입력: ");
        Long id = scanner.nextLong();;
        System.out.print("비밀번호: ");
        String boardPass = scanner.next();;
        boolean resultBoard =boardRepository.check(id, boardPass);
        if (resultBoard){
            System.out.print("제목: ");
            String boardTitle = scanner.next();;
            System.out.print("내용: ");
            String boardContents = scanner.next();
            boolean result = boardRepository.update(boardTitle,boardContents);
        }else {
            System.out.print("비밀번호 틀림");
        }

    }

    public void delete() {
        System.out.print("삭제할 글번호: ");
        Long id = scanner.nextLong();
        System.out.print("비밀번호: ");
        String  boardPass = scanner.next();
        boolean result = boardRepository.delete(id, boardPass);
        if (result){
            System.out.println("글이 삭제됨");
        }else {
            System.out.println("삭제실패");
        }
    }

    public void search() {
        System.out.print("제목: ");
        String boardTitle = scanner.next();
        List<BoardDTO> boardDTOList = boardRepository.search(boardTitle);
            if (boardDTOList.size() > 0){
                for (int i = 0; i < boardDTOList.size(); i++) {
                    System.out.println(boardDTOList.get(i));
        }
        }else {
                System.out.println("검색결과 없음");

            }

    }
}
