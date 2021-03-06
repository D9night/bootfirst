package com.liuxscomp.common.pojo.vo;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class Response<T> implements Serializable {

    public static final Response success = Response.normal(0, null, null);
    public static final Response errorSys = Response.normal(0x00001, null,"后台服务接收数据失败");
    public static final Response errorJson = Response.normal(0x00002, null,"JSON解析错误");
    public static final Response errorApi = Response.normal(0x00004, null,"未定义的协议");
    public static final Response errorDb = Response.normal(0x00006, null,"数据库操作失败");
    public static final Response errorAuth = Response.normal(0x00008, null,"请登录后进行操作");
    public static final Response errorAuth1 = Response.normal(0x00009, null,"token错误");
    public static final Response errorAuth2 = Response.normal(0x0000a, null,"token已过期，请重新登录");
    public static final Response dataEmpty = Response.normal(0x0000b, null,"data is empty");
    public static final Response accountExit = Response.normal(1000, null,"您的账号已在别的移动设备登录");
    public static final Response hasNoPermission = Response.normal(1002, null,"没有该接口资源权限");
    public static final Response needWechatBind = Response.normal(1003, null,"未绑定微信信息");
    public static final Response needPlatformAuth = Response.normal(1004, null,"无该平台登录权限");
    public static final Response forbiddenOperate = Response.normal(1005, null,"您无权进行此操作");
    public static final Response reservationChecked = Response.normal(1006, null,"该用户已确认到检");
    public static final Response tokenError = Response.normal(1007, null,"登陆token错误");
    public static final Response needMiniprogramUserInfo = Response.normal(1008, null,"缺少unionid");
    public static final Response illegalArgumentError = Response.error("参数不符合要求");
    public static final int refreshToken = 1001;

    final String msg;

    final int rc;

    final T data;

    private Response(int rc, T data, String msg) {
        this.rc = rc;
        this.data = data;
        this.msg = msg;
    }

    public static <R> Response<R> ok(R object){
        return new Response<R>(0, object, null);
    }

    public static <R> Response<R> error(int code, String message){
        return new Response<R>(code, null, message);
    }

    public static <R> Response<R> error(String message) {
        return new Response<R>(1, null, message);
    }

    public static <R> Response<R> normal(int code, R object, String message){
        return new Response<R>(code, object, message);
    }

    @Override
    public String toString() {
        return "Response{" +
                "msg='" + msg + '\'' +
                ", rc=" + rc +
                ", data=" + data +
                "}";
    }

    public static Response<Void> errorParam(String argName) {
        return error(3, "错误的" + argName + "参数");
    }
    public static Response<Void> errorParams(String argName) {
        return error(4, argName );
    }


}
