package com.bo.result;

import lombok.Getter;

//结果类枚举
@Getter
public enum ResultCodeEnum {

    SUCCESS(true,10000,"成功"),
    UNKNOWN_ERROR(false,10001,"未知错误"),
    PARAM_ERROR(false, 10002, "参数错误"),
    NULL_POINT_ERROR(false,10003,"空指针异常"),
    HTTP_CLIENT_ERROR(false,10004,"客户端异常"),
    BIND_ERROR(false, 20005, "绑定异常:%s")
    ;

    //响应是否成功
    private Boolean success;
    //响应状态码
    private Integer code;
    //响应信息
    private String message;

    ResultCodeEnum(boolean success,Integer code,String message){
        this.success = success;
        this.code = code;
        this.message = message;
    }


}
