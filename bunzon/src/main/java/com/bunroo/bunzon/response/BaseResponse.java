package com.bunroo.bunzon.response;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BaseResponse {
    private String statusCode;
    private String message;
}
