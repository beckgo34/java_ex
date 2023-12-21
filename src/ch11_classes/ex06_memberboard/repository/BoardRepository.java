package ch11_classes.ex06_memberboard.repository;

import ch11_classes.ex06_memberboard.dto.BoardDTO;

import java.util.ArrayList;
import java.util.List;

public class BoardRepository {
    List<BoardDTO> boardDTOList = new ArrayList<>();

    public boolean boardWrite(BoardDTO boardDTO) {
        return boardDTOList.add(boardDTO);
    }

    public List<BoardDTO> boardList() {
        return boardDTOList;
    }

    public List<BoardDTO> boardSearch(String q) {
    }
}
