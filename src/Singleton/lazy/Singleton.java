package Singleton.lazy;

/**
 * 懒汉式，延迟加载，线程不安全
 *
 */
public class Singleton {
    private static Singleton singleton = null;
    private Singleton(){};

    public static Singleton getInstance(){
        if(singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }

}
