package com.green.springfirst.board.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class BoardInsDto {
    private String title;
    private String ctnts;
    private String writer;
}
