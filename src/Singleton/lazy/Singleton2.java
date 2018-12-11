package Singleton.lazy;

/**
 * 懒汉式，线程安全，但每次获取都要等待锁释放效率低下
 */
public class Singleton2 {
    private static Singleton2 singleton2 = null;
    private Singleton2(){}

    public static synchronized Singleton2 getInstance(){
        if(singleton2 == null){
            singleton2 = new Singleton2();
        }
        return singleton2;
    }


}
