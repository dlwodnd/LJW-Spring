package com.green.springfirst.board;

import com.green.springfirst.board.model.BoardVo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service //Bean등록
//@RequiredArgsConstructor
public class BoardService {
    private final BoardMapper mapper;
    @Autowired //의존 객체 타입에 해당하는 bean을 찾아 주입한다.
    public BoardService(BoardMapper mapper){
        this.mapper = mapper;
    }
    public List<BoardVo> getBoard(){
        return mapper.selBoardList();
    }
}
