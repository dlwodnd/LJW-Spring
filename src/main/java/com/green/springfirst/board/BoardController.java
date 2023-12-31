package com.green.springfirst.board;
import com.green.springfirst.ResVo;
import com.green.springfirst.RsVo;
import com.green.springfirst.board.model.BoardDetailVo;
import com.green.springfirst.board.model.BoardInsDto;
import com.green.springfirst.board.model.BoardUpdDto;
import com.green.springfirst.board.model.BoardVo;
import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController //Controller를 담당하면서 Bean등록
//Controller 어노테이션은 @Controller 와 @RestController가 있는데
//@Controller은 html @RestController은 json 형태로 데이터를 반환한다
@RequiredArgsConstructor
//final이 붙거나 @notNull이 붙은 필드의 생성자를 자동 생성해주는 롬복 어노테이션
//Bean은 객체생성 권한을 스프링컨테이너에게 주고 요청 하는 것
//Bean 등록한 객체는 싱글톤 하나만 만든다.
//싱글톤 객체 하나의 변하지 않는 값을 돌려 쓰는 것
//ioc inversion of control : 제어의 역전
//VO는 Value Object : 한번 입력되면 값이 바뀌지 않는 객체
//DTO Data Transfer Object : 값을 옮길 용도로 쓰이는 객체
@RequestMapping("/api/board")
//컨트롤러에 @RequestMapping("/board")를 입력하면
public class BoardController {
    private final BoardService service;

    @GetMapping
    //Mapping 어노테이션은 데이터 전송에 분기를 줄 때 사용한다.
    public List<BoardVo> getBoard(){
        return service.getBoard();
    }
    @GetMapping("/api/{iboard}")
    public BoardDetailVo selBoardDetail(@PathVariable int iboard){
        System.out.println(iboard);
        return service.getBoardById(iboard);
    }
    @DeleteMapping("/api/{iboard}")
    public ResVo delBoard(@PathVariable int iboard){
                        //@PathVariable 주소값에 적힌 값은 파라미터로 받게 만드는 것.
        int result = service.delBoard(iboard);
        return new ResVo(result);
    }

    @PostMapping
    //@RequestBody json으로 들어온 값을 객체형식으로 바꾸는 것
    public RsVo postBoard(@RequestBody BoardInsDto dto){
                        //@RequestBody : 제이슨 형태로 들어온 데이터를 객체로 변경해서
                                       //파라미터로 받는 것
    //컨트롤러에 모든 메소드는 서블릿이 객체화 한다.
        System.out.println(dto);
        int result = service.insBoard(dto);
        return new RsVo(result);
    }
    @PutMapping
    public ResVo putBoard(@RequestBody BoardUpdDto dto){
        int result = service.updaBoard(dto);
        return new ResVo(result);
    }


    /*
    # http - method 통신 메소드 #
    C - Insert - post : body에 데이터를 담아서 요청
                        post는 많은 데이터를 보내고 데이터를 숨기고 싶을 때 사용한다.
    R - Select - get(여러개) :[/board] Query String을 사용한다.(필수)
                 get(한개) : [/board/pk값] (Path Variable)
    U - Update - put/patch : body에 데이터를 담아서 요청
    D - Delete - delete: Query String을 사용한다.(상황마다 다름)
    */
    //port번호는 현재 pc의 os에 저장된 번호

    /*
    post 방식과 get 방식의 차이점은 post 방식은 데이터를 숨겨서 보낼 수 있다.
    get은 주소창에 어떤 데이터가 가는지 주소창에서 볼 수있기 때문에
    보낼 데이터를 숨길려면 post 방식을 사용해야 한다.
     */
    /*
    RESTful api를 사용하기 전 게시판 만드는 방법.

    글 쓰기 (화면) : (get) / board
          (처리) : (post)/ board
    작성 글 리스트 :  (get)/ boardList
    작성 글 보기   : (get)/boardDetail?iboard=1
    작성한 글 삭제 :  (get/post) /boardDel?iboard=1
    글 수정(화면)  : (get) /boardMod?iboard=1
    글 수정(처리)  : (post) /boardMod
    */

}
