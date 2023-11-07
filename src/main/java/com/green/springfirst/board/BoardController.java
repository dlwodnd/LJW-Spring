package com.green.springfirst.board;

import com.green.springfirst.board.model.BoardVo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController //Bean등록
@RequiredArgsConstructor//꼭 받아야 하는 유일한 생성자의 주소값을 받아온다.
//Bean은 객체생성을 스프링에서 관리하는 것
public class BoardController {
    @Autowired//Bean 등록된 객체하나를 자동으로 주소값을 입력
    private final BoardService service;
    @GetMapping("/board")
    public List<BoardVo> getBoard(){
        return service.getBoard();
    }
}
