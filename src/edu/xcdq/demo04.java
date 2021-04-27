package edu.xcdq;

/**
 * @version 1.0
 * @Author: zhushiji
 * @date: 2021/4/27 15:31
 */
public class demo04 {
    public static void main(String[] args) throws Exception{  //继续向上声明异常，不处理
        /*try {
            setSex("双性人");

        }catch (Exception e){  //调用者处理异常
            e.printStackTrace();
            System.out.println("非男非女");
        }*/   //放开此段代码须将类方法中的“throws Exception"删除
        setSex("afwarf");
    }
    public static void setSex(String sex) throws Exception{  //声明异常
        if ( !(sex.equals("男") || sex.equals("女"))){
            throw new Exception("处理不了的异常，扔出去");   //抛出异常
        }
    }
}
