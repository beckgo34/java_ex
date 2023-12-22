package ch11_classes.ex06_memberboard.repository;

import ch11_classes.ex06_memberboard.dto.BoardDTO;
import ch11_classes.ex06_memberboard.dto.CommentDTO;

import java.util.ArrayList;
import java.util.List;

public class CommentRepository {
    List<CommentDTO> commentDTOList = new ArrayList<>();


    public boolean comment(CommentDTO commentDTO) {
        return commentDTOList.add(commentDTO);
    }


    public List<CommentDTO> commentList() {
        return commentDTOList;
    }
}
