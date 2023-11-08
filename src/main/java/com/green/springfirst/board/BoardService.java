package com.green.springfirst.board;

import com.green.springfirst.board.model.BoardDetailVo;
import com.green.springfirst.board.model.BoardInsDto;
import com.green.springfirst.board.model.BoardUpdDto;
import com.green.springfirst.board.model.BoardVo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service //Bean등록
//서비스클래스는 로직 구현을 위해 만들어 진다.
@RequiredArgsConstructor
public class BoardService {
    //@Autowired 의존 객체 타입에 해당하는 bean을 찾아 주입한다.
    private final BoardMapper mapper;


    public List<BoardVo> getBoard(){
        return mapper.selBoardList();
    }
    public BoardDetailVo getBoardById(int iboard){
        return mapper.selBoardById(iboard);
    }
    public int insBoard(BoardInsDto dto){
        return mapper.insBoard(dto);
    }
    public int delBoard(int iboard){
        return mapper.delBoard(iboard);
    }
    public int updaBoard(BoardUpdDto dto){
        return mapper.updBoard(dto);
    }

}
