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
        List<BoardDTO> searchList = new ArrayList<>();
        for (int i = 0; i < boardDTOList.size(); i++) {
            if (boardDTOList.get(i).getBoardTitle().contains(q)){
                searchList.add(boardDTOList.get(i));
            }

        }
        return searchList;
    }

    public boolean boardUpdate(String boardTitle, String boardContents) {
        for (int i = 0; i < boardDTOList.size(); i++) {
            boardDTOList.get(i).setBoardTitle(boardTitle);
            boardDTOList.get(i).setBoardContents(boardContents);
            return true;
        }
        return false;
    }

    public BoardDTO boardFind(Long id) {
        for (int i = 0; i < boardDTOList.size(); i++) {
            if (id.equals(boardDTOList.get(i).getId())){
                return boardDTOList.get(i);
            }
        }
        return null;
    }

    public boolean boardDelete(Long id) {
        boolean result = false;
        for (int i = 0; i < boardDTOList.size(); i++) {
            if (id.equals(boardDTOList.get(i).getId())){
                boardDTOList.remove(i);
                result = true;
            }
        }
        return result;
    }

    public boolean updateHits(Long id) {
        for (int i = 0; i < boardDTOList.size(); i++) {
            if (id.equals(boardDTOList.get(i).getId())){
                int hits = boardDTOList.get(i).getBoardHits();
                hits = hits + 1;
                boardDTOList.get(i).setBoardHits(hits);
                return true;
            }
        }
        return false;
    }
}
