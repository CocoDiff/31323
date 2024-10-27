package co.kr.test.board.controller;

import co.kr.test.board.entity.Board;
import co.kr.test.board.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BoardController {

    @Autowired
    private BoardService boardService;

    @GetMapping("/api/board")
    public List<Board> getBoardList() {
        return  boardService.getBoardList();
    }
}
