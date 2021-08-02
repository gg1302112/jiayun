package com.lzw.bean.result;

/**
 * @author: lzw
 * @date: 21/7/29 - 07 - 29 - 21:30
 * @description: com.lzw.bean.result
 * @version: 1.0
 */

public class ResultObject {
    private String message = "";

    private Integer code = 200;

    private Object result;

    public ResultObject(Object result) {
        this.result = result;
    }

    public ResultObject() {
    }

    public ResultObject(String message, Object result) {
        this.message = message;
        this.result = result;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "ResoutObject{" +
                "message='" + message + '\'' +
                ", code=" + code +
                ", result=" + result +
                '}';
    }
}
