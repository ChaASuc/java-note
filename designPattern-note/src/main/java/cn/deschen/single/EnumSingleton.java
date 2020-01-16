package cn.deschen.single;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @program: java-note
 * @author: deschen
 * @description: 枚举单例
 * @create: 2020/01/15 18:06
 **/

public enum EnumSingleton {

    ENUM_SINGLETON,
    ;
    public EnumSingleton getInstance(){
        return ENUM_SINGLETON;
    }
}
