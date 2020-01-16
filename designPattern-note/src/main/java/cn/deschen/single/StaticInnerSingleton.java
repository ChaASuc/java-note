package cn.deschen.single;

/**
 * @program: java-note
 * @author: deschen
 * @description: 静态内部类单例模式
 * @create: 2020/01/15 14:20
 **/

public class StaticInnerSingleton {

    private static StaticInnerSingleton singleton = null;

    private StaticInnerSingleton(){
        System.out.println("类被调用创建实例");
    }

    public static StaticInnerSingleton getInstance() {
        return StaticInner.singleton;
    }

    private static class StaticInner {
        private static StaticInnerSingleton singleton = new StaticInnerSingleton();
    }
}
