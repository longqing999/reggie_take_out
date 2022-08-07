package com.zsl.reggie.common;



/**
 * @Author zhaoshilong
 * @create 2022/8/7 17:32
 * 自定义业务异常类
 */
public class CustomException extends RuntimeException{
    public CustomException(String message){
        super(message);
    }
}
