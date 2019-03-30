package com.example.response;

import java.io.Serializable;

public class CommonResponseBo implements Serializable {

    private String code;

    private String message;


    public CommonResponseBo(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


}
