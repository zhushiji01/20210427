package edu.xcdq;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @version 1.0
 * @Author: zhushiji
 * @date: 2021/4/27 15:08
 */
public class demo02 {
    public static void main(String[] args) {
        int [] a = new int[2];
        Scanner scanner = new Scanner(System.in);
        try {
            int i = scanner.nextInt();
            int j = scanner.nextInt();
            a[0] = i;
            a[2] = j;
            System.out.println(a[0] / a[2]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("数组越界异常");
        }catch (InputMismatchException e){
            System.out.println("数组格式不正常异常");
        }catch (ArithmeticException e){
            System.out.println("算术异常");
        }

    }
}
