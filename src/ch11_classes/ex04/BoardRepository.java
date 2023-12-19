package ch11_classes.ex04;

import java.util.ArrayList;
import java.util.List;

public class BoardRepository {
    List<BoardDTO> boardDTOList = new ArrayList<>();
    public boolean list(BoardDTO boardDTO) {
            return boardDTOList.add(boardDTO);
    }

    public void findAll() {
        for (int i = 0; i < boardDTOList.size(); i++) {
            System.out.print("글번호: " + boardDTOList.get(i).getId());
            System.out.print(" 글제목: " + boardDTOList.get(i).getBoardTitle());
            System.out.println(" 글작성자: " + boardDTOList.get(i).getBoardWriter());
            System.out.println(" 조회수: " + boardDTOList.get(i).getBoardCount());
        }
    }

    public BoardDTO findBoard(Long id) {
        BoardDTO boardDTO = null;
        for (int i = 0; i < boardDTOList.size(); i++) {
            if (id.equals(boardDTOList.get(i).getId())){
                boardDTO = boardDTOList.get(i);
            }
        }
        return boardDTO;

    }

    public boolean update(Long id, String boardPass, String boardTitle, String boardContents) {
        boolean result = false;
        for (int i = 0; i < boardDTOList.size(); i++) {
            if(id.equals(boardDTOList.get(i).getId()) && boardPass.equals(boardDTOList.get(i).getBoardPass())){
                boardDTOList.get(i).setBoardTitle(boardTitle);
                boardDTOList.get(i).setBoardContents(boardContents);
                result = true;
            }
        }
            return result;

    }

    public boolean delete(Long id, String boardPass) {
        boolean result = false;
        for (int i = 0; i < boardDTOList.size(); i++) {
            if(id.equals(boardDTOList.get(i).getId()) && boardPass.equals(boardDTOList.get(i).getBoardPass())){
                boardDTOList.remove(i);
                result = true;
            }
        }
            return result;
    }

    public List<BoardDTO> search(String boardTitle) {
        List<BoardDTO> boardDTOS = new ArrayList<>();
        for (int i = 0; i < boardDTOList.size(); i++) {
            if (boardDTOList.get(i).getBoardTitle().contains(boardTitle)){
                BoardDTO boardDTO = boardDTOList.get(i);
                boardDTOS.add(boardDTO);
            }
            
        }
        return boardDTOS;
    }
}
