package com.green.springfirst.board;

import com.green.springfirst.board.model.BoardVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {
    List<BoardVo> selBoardList();
}
