package cn.tinytank.mmp.utils;

import java.io.Serializable;

/**
 * HTTP统一返回格式
 * @author tinytank
 * @date 2020/6/5 11:02 下午
 */
public class Response<T> implements Serializable {

    /** 错误码 **/
    private Integer code;

    /** 错误信息 **/
    private String msg;

    /** 具体内容 **/
    private T data;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

}
