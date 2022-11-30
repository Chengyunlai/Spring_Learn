package spring_05_39_introduction.aop.utils;

import java.util.Arrays;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
public class LogUtils {
    // public static void printLog(String className, String methodName, String userId, int points) {
    //     System.out.println(className + " " + methodName + " ...");
    //     System.out.println("user: " + userId + ", points: " + points);
    // }
    public static void printLog(String className, String methodName, Object... args) {
        System.out.println(className + " " + methodName + " ...");
        System.out.println("参数列表: " + Arrays.toString(args));
    }
}