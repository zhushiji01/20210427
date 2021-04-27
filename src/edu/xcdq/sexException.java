package edu.xcdq;

/**
 * @version 1.0
 * @Author: zhushiji
 * @date: 2021/4/27 15:43
 */
public class sexException extends Exception{
    public sexException(){

    }
    public sexException(String message){
        //super(message);
        System.out.println(message);
        System.out.println("我是自定义的异常，知道是非男非女，但我也没办法处理");
        System.out.println(".........");
    }
}
