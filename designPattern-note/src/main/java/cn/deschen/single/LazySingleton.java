//package cn.deschen.single;
//
///**
// * @program: java-note
// * @author: deschen
// * @description: 懒汉模式
// * @create: 2020/01/15 11:26
// **/
//
//public class LazySingleton {
//
//    private static LazySingleton singleton = null;
//
//    private LazySingleton() {}
//
//    public static LazySingleton getInstance() {
//        // 判断实例是否已创建
//        if (null == singleton) {
//            singleton = new LazySingleton();
//        }
//        return singleton;
//    }
//}
