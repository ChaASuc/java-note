package cn.deschen.single;

/**
 * @program: java-note
 * @author: deschen
 * @description: 饿汉模式
 * @create: 2020/01/15 14:06
 **/

public class HungrySinglenton {

    private static HungrySinglenton singlenton = new HungrySinglenton();

    private HungrySinglenton(){}

    public static HungrySinglenton getInstance() {
        return singlenton;
    }

}
