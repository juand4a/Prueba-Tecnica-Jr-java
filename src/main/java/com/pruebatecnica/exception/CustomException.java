package com.pruebatecnica.exception;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class CustomException extends Exception{
    private  String devlopMsg;
    private  String useMsg;
    private  Integer statusCode;
}
