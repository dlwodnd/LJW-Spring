package com.green.springfirst.board;

import com.green.springfirst.board.model.BoardVo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service //Bean등록
@RequiredArgsConstructor
public class BoardService {
    private final BoardMapper mapper;
    public List<BoardVo> getBoard(){
        return mapper.selBoardList();
    }
}
