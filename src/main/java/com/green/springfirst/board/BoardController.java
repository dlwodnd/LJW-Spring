package com.green.springfirst.board;

import com.green.springfirst.board.model.BoardDetailVo;
import com.green.springfirst.board.model.BoardVo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController //Controller를 담당하면서 Bean등록
//Controller 어노테이션은 @Controller 와 @RestController가 있는데
//@Controller은 xml @RestController은 json 형태로 데이터를 반환한다
@RequiredArgsConstructor
//final이 붙거나 @notNull이 붙은 필드의 생성자를 자동 생성해주는 롬복 어노테이션
//Bean은 객체생성 권한을 스프링컨테이너에게 주고 요청 하는 것
//싱글톤 객체 하나의 변하지 않는 값을 돌려 쓰는 것
public class BoardController {
    @Autowired//Bean 등록된 객체하나를 자동으로 주소값을 입력
    private final BoardService service;
    @GetMapping("/board")
    //Mapping 어노테이션은 데이터 전송에 분기를 줄 때 사용한다.
    public List<BoardVo> getBoard(){
        return service.getBoard();
    }
    @GetMapping("/board/{iboard}")
    public BoardDetailVo getBoardDetail(@PathVariable int iboard){
        System.out.println(iboard);
        return service.getBoardDetail(iboard);
    }

    @PostMapping("/board")
    public int insBoard(){
        return 1;
    }

    /*
    # http - method 통신 메소드 #
    C - Insert - post : body에 데이터를 담아서 요청
    R - Select - get(여러개) :[/board] Query String을 사용한다.(필수)
                 get(한개) : [/board/pk값] (Path Variable)
    U - Update - put/patch : body에 데이터를 담아서 요청
    D - Delete - delete: Query String을 사용한다.(상황마다 다름)
    */
    //port번호는 현재 pc의 os에 저장된 번호

}
