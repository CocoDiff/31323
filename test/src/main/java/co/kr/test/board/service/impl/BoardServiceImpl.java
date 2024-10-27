package co.kr.test.board.service.impl;

import co.kr.test.board.entity.Board;
import co.kr.test.board.repository.BoardRepository;
import co.kr.test.board.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardServiceImpl implements BoardService {

    @Autowired
    BoardRepository boardRepository;

    @Override
    public List<Board> getBoardList() {
        return boardRepository.findAll();
    }
}
