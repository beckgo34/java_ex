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
        List<BoardDTO> boardDTOList = boardRepository.boardList();
        for (BoardDTO boardDTO : boardDTOList) {
            System.out.println("boardDTO = " + boardDTO);;
        }
    }

    public void boardSearch() {
        System.out.println("검색어: ");
        String q = scanner.next();
        List<BoardDTO> boardSearch = boardRepository.boardSearch(q);
        if (boardSearch > 0){
            System.out.println(boardSearch);
        }
    }
}

