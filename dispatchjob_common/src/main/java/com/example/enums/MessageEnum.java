package com.example.enums;


public enum MessageEnum {
    RESULT_SUCCESS("000","操作成功"),
    RESULT_FAIL("999","操作失败");

    private String code;
    private String message;

    MessageEnum(String code, String message) {
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
