package edu.xcdq;

/**
 * @version 1.0
 * @Author: zhushiji
 * @date: 2021/4/27 15:46
 */
public class demo05 {
    public static void main(String[] args){  //继续向上声明异常，不处理
        try {
            setSex("双性人");

        }catch (Exception e){  //调用者处理异常
            System.out.println("调用者说处理过了");
        }
    }
    public static void setSex(String sex) throws Exception{  //声明异常
        if ( !(sex.equals("男") || sex.equals("女"))){
            throw new sexException("发现一个不对劲的");   //抛出异常
           // throw new sexException();  两者只留其一
        }
    }
}
