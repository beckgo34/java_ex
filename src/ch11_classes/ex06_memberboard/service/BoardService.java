package ch11_classes.ex06_memberboard.service;

import ch11_classes.ex06_memberboard.common.CommonVariables;
import ch11_classes.ex06_memberboard.dto.BoardDTO;
import ch11_classes.ex06_memberboard.repository.BoardRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BoardService {
    BoardRepository boardRepository = new BoardRepository();
    Scanner scanner = new Scanner(System.in);


    public void boardWrite() {
        if (CommonVariables.loginEmail != null) {
            System.out.println("제목: ");
            String boardTitle = scanner.next();
            System.out.println("내용: ");
            String boardContents = scanner.next();
            BoardDTO boardDTO = new BoardDTO(boardTitle, boardContents);
            boolean result = boardRepository.boardWrite(boardDTO);
            if (result) {
                System.out.println("글작성 완료");
            } else {
                System.out.println("글작성 실패");
            }
        }
    }

    public void boardList() {
        if (CommonVariables.loginEmail != null) {
            List<BoardDTO> boardDTOList = boardRepository.boardList();
            for (BoardDTO boardDTO : boardDTOList) {
                System.out.println("boardDTO = " + boardDTO);
                ;
            }
        }
    }

    public void boardSearch() {
        if (CommonVariables.loginEmail != null) {
            System.out.println("검색어: ");
            String q = scanner.next();
            List<BoardDTO> boardSearch = boardRepository.boardSearch(q);
            if (boardSearch.size() > 0) {
                System.out.println("검색결과");
                System.out.println("boardSearch = " + boardSearch);
            } else {
                System.out.println("결과가 없음");
            }
        }
    }


    public void boardUpdate() {
        if (CommonVariables.loginEmail != null) {
            System.out.println("수정할 제목: ");
            String boardTitle = scanner.next();
            System.out.println("수정할 내용: ");
            String boardContents = scanner.next();
            boolean result = boardRepository.boardUpdate(boardTitle, boardContents);
            if(result){
                System.out.println("수정 성공");
            }else {
                System.out.println("수정 실패");
            }

        }
    }

    public void boardFind() {
        System.out.println("조회할 id: ");
        Long id = scanner.nextLong();
        BoardDTO boardDTO = boardRepository.boardFind(id);
        if (boardDTO != null){
            System.out.println(boardDTO);
        }else {
            System.out.println("조회한 id 게시물 없음");
        }
    }
}

