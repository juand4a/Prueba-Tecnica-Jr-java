package com.pruebatecnica.util;

import com.pruebatecnica.domain.Response;

public class GeneralUtils {
    public static Response<Object> builderResponse(String useMsg,String devMsg ,Integer statusCode ,Object data){
        return Response
                .builder()
                .devlopMsg(devMsg)
                .useMsg(useMsg)
                .statusCode(statusCode)
                .data(data)
                .build();
    }
}
