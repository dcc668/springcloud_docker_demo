package com.sermatec.common.utils;

/**
 * @author : DongChenchen
 * @date : 2019/4/8  13:48
 */
public class Result {
    private static final long serialVersionUID = 1L;
    //返回码
    private String code;
    //返回消息
    private String msg;
    //返回数据对象
    private Object data;

    public Result() {
    }

    public Result(String code, String message) {
        this.code = code;
        this.msg = message;
    }

    public Result(String code, Object data) {
        this.code = code;
        this.data = data;
    }

    public void setResult(String code, String message) {
        this.code = code;
        this.msg = message;
    }

    public void setResult(String code, Object data) {
        this.code = code;
        this.data = data;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
