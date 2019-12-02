package com.ylc.permission.common;

import lombok.Data;

/**
 * @Description: 通用返回实体类
 * @Date: 2019/11/25
 */
@Data
public class JsonData {

    private boolean result;

    private String msg;

    private Object data;

    public JsonData(boolean result){
        this.result = result;
    }

    public static JsonData success(Object data, String msg){
        JsonData jsonData = new JsonData(true);
        jsonData.setData(data);
        jsonData.setMsg(msg);
        return jsonData;
    }

    public static JsonData success(Object data){
        JsonData jsonData = new JsonData(true);
        jsonData.setData(data);
        return jsonData;
    }
    public static JsonData success(){
        JsonData jsonData = new JsonData(true);
        return jsonData;
    }

    public static JsonData fail(String msg){
        JsonData jsonData = new JsonData(false);
        jsonData.setMsg(msg);
        return jsonData;
    }
}

























