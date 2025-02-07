package com.pruebatecnica.domain;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Response <T>{
    private  String devlopMsg;
    private  String useMsg;
    private  Integer statusCode;
    private T data;
}
