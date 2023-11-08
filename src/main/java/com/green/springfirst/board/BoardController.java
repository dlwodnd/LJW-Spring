package com.green.springfirst.board;

import com.green.springfirst.board.model.BoardVo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController //Bean등록
@RequiredArgsConstructor
//final이 붙거나 @notNull이 붙은 필드의 생성자를 자동 생성해주는 롬복 어노테이션
//Bean은 객체생성 권한을 스프링컨테이너에게 넘기는 것
//싱글톤 객체 하나의 변하지 않는 값을 돌려 쓰는 것
public class BoardController {
    @Autowired//Bean 등록된 객체하나를 자동으로 주소값을 입력
    private final BoardService service;
    @GetMapping("/board")
    public List<BoardVo> getBoard(){
        return service.getBoard();
    }
}
