package com.green.springfirst.board;

import com.green.springfirst.board.model.BoardDetailVo;
import com.green.springfirst.board.model.BoardInsDto;
import com.green.springfirst.board.model.BoardUpdDto;
import com.green.springfirst.board.model.BoardVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {
    List<BoardVo> selBoardList();
    BoardDetailVo selBoardById(int iboard);
    int insBoard(BoardInsDto dto);
    int delBoard(int iboard);
    int updBoard(BoardUpdDto dto);
    // INSERT SELECT UPDATE(PUT,PATH) DELETE 중 SELECT를 제외한 나머지의 리턴값은 int이다.
}
