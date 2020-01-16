package cn.deschen.single;

import java.lang.annotation.Target;

/**
 * @program: java-note
 * @author: deschen
 * @description: 双重检查加锁
 * @create: 2020/01/15 11:33
 **/

public class DoubleCheckLockSingleton {

    /*使用volatile 防止 类初始化重排*/
    private volatile static DoubleCheckLockSingleton singleton = null;

    private static boolean flag = false;

    private DoubleCheckLockSingleton() {
        // 防止多线程进入
        synchronized(DoubleCheckLockSingleton.class) {
            if(flag == false) {
                flag = !flag;
                System.out.println(Thread.currentThread().getName() + " come in");
            } else {
                throw new RuntimeException("单例模式被侵犯！");
            }
        }
    }

    public static DoubleCheckLockSingleton getInstance() {
        // 判断是否存在，不过多线程可以进入
        if (null == singleton) {
            // 判断是否存在，避免不要的实例,不过多线程可以进入
            if (null == singleton) {
                // 使用synchronized，单线程通行，防止多线程进入
                synchronized (DoubleCheckLockSingleton.class) {
                    System.out.println("thread of creating instance: " + Thread.currentThread().getName());
                    singleton = new DoubleCheckLockSingleton();
                }
            }
        }
        return singleton;
    }
}
