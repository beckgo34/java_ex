package ch11_classes.ex06_memberboard.service;

import ch11_classes.ex06_memberboard.common.CommonVariables;
import ch11_classes.ex06_memberboard.dto.BoardDTO;
import ch11_classes.ex06_memberboard.dto.CommentDTO;
import ch11_classes.ex06_memberboard.repository.BoardRepository;
import ch11_classes.ex06_memberboard.repository.CommentRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BoardService {
    BoardRepository boardRepository = new BoardRepository();
    CommentRepository commentRepository = new CommentRepository();
    Scanner scanner = new Scanner(System.in);


    public void boardWrite() {
        if (CommonVariables.loginEmail != null) {
            System.out.print("제목: ");
            String boardTitle = scanner.next();
            System.out.print("내용: ");
            String boardContents = scanner.next();
            BoardDTO boardDTO = new BoardDTO(boardTitle, boardContents);
            boolean result = boardRepository.boardWrite(boardDTO);
            if (result) {
                boardDTO.setBoardWriter(CommonVariables.loginEmail);
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
            System.out.print("검색어: ");
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
            System.out.print("수정할 제목: ");
            String boardTitle = scanner.next();
            System.out.print("수정할 내용: ");
            String boardContents = scanner.next();
            boolean result = boardRepository.boardUpdate(boardTitle, boardContents);
            if (result) {
                System.out.println("수정 성공");
            } else {
                System.out.println("수정 실패");
            }

        }
    }

    public void boardFind() {
        if (CommonVariables.loginEmail != null) {
            System.out.print("조회할 id: ");
            Long id = scanner.nextLong();
            boolean result = boardRepository.updateHits(id);
            List<CommentDTO> commentDTOList = new ArrayList<>();
            if (result) {
                BoardDTO boardDTO = boardRepository.boardFind(id);
                System.out.println("boardDTO = " + boardDTO);
                System.out.println("===== 댓글 =====");
                if (commentDTOList != null) {
                    commentList();
                }else{
                    System.out.println("작성된 댓글이 없습니다");
                }
            }
            System.out.println("댓글을 작성하려면 1번을 눌러주세요");
            System.out.println("매인메뉴로 돌아가려면 2번을 눌러주세요");
            System.out.print("입력> ");
            int selectComment = scanner.nextInt();
            if (selectComment == 1) {
            comment();
            }
        } else {
            System.out.println("조회한 id 게시물 없음");
        }
    }


    public void boardDelete() {
        if (CommonVariables.loginEmail != null) {
            System.out.print("삭제할 id: ");
            Long id = scanner.nextLong();
            boolean result = boardRepository.boardDelete(id);
            if (result) {
                System.out.println("삭제성공");
            } else {
                System.out.println("삭제실패");
            }
        }
    }

    public void comment() {
        if (CommonVariables.loginEmail != null) {
            System.out.print("댓글내용: ");
            String comment = scanner.next();
            CommentDTO commentDTO = new CommentDTO(comment);
            boolean result = commentRepository.comment(commentDTO);
            if (result) {
                commentDTO.setCommentWriter(CommonVariables.loginEmail);
                System.out.println("댓글작성 성공");
            } else {
                System.out.println("댓글작성 실패");
            }
        }
    }

    public void commentList() {
        List<CommentDTO> commentDTOList = commentRepository.commentList();
        for (CommentDTO commentDTO : commentDTOList) {
            System.out.println("commentDTO = " + commentDTO);
        }

    }
}

