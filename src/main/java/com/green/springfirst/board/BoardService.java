package com.green.springfirst.board;

import com.green.springfirst.board.model.BoardDetailVo;
import com.green.springfirst.board.model.BoardVo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service //Bean등록
@RequiredArgsConstructor
public class BoardService {
    //@Autowired 의존 객체 타입에 해당하는 bean을 찾아 주입한다.
    private final BoardMapper mapper;


    public List<BoardVo> getBoard(){
        return mapper.selBoardList();
    }
    public BoardDetailVo getBoardDetail(int iboard){
        return mapper.selBoardById(iboard);
    }

}
