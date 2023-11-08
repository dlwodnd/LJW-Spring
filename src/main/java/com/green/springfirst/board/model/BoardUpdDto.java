package com.green.springfirst.board.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
public class BoardUpdDto {
    private int iboard;
    private String title;
    private String ctnts;
    private String writer;

}
