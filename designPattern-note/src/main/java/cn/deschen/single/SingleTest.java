package cn.deschen.single;

class LazySingleton {

    private static LazySingleton singleton = null;

    private LazySingleton() {}

    public static LazySingleton getInstance() {
        // 判断实例是否已创建
        if (null == singleton) {
            System.out.println("Thread of creating instance: " + Thread.currentThread().getName());
            singleton = new LazySingleton();
            // 创建实例
            System.out.println("Thread of instance: " + singleton);
        }
        return singleton;
    }
}

public class SingleTest {

    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep((long) (Math.random() * 10));
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + LazySingleton.getInstance());
                }
            }, "thread " + i).start();
        }

    }
}