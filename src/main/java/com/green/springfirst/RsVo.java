package com.green.springfirst;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class RsVo {
    private int result;

    /*
    @AllArgsConstructor @notnull이나 final인 필드값만 받는 생성자를 만들어 준다.
    public RsVo(int result){
        this.result = result;
    }
    만약 RsVo클래스에 다른 필드값이 들어오면 파라미터에 자동으로 추가된다.
     */
}
