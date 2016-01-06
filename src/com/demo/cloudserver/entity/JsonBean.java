package com.demo.cloudserver.entity;

import java.util.List;


public class JsonBean {

    private int statusCode;
    private String msg;
    private Object obj;
    private List<Object> list;
    public JsonBean(int code, String msg, Object obj) {
        this.statusCode = code;
        this.msg = msg;
        this.obj = obj;
    }
    public JsonBean(int code, String msg, List<Object> list) {
        this.statusCode = code;
        this.msg = msg;
        this.list = list;
    }
    public JsonBean(int code, String msg, Object obj, List<Object> list) {
        this.statusCode = code;
        this.msg = msg;
        this.obj = obj;
        this.list = list;
    }
    public JsonBean(int code, String msg) {
        this.statusCode = code;
        this.msg = msg;
    }
    public int getStatusCode() {
        return statusCode;
    }
    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }
    public String getMsg() {
        return msg;
    }
    public void setMsg(String msg) {
        this.msg = msg;
    }
    public Object getObj() {
        return obj;
    }
    public void setObj(Object obj) {
        this.obj = obj;
    }
    public List<Object> getList() {
        return list;
    }
    public void setList(List<Object> list) {
        this.list = list;
    }
    @Override
    public String toString() {
        return "JsonBean [statusCode=" + statusCode + ", msg=" + msg + ", obj="
                + obj + ", list=" + list + "]";
    }
    
}
