package Singleton.lazy;

/**
 * 懒汉式，线程不安全
 * 虽然给类加了锁，但是判断条件仍然是线程不安全的
 */
public class Singleton3 {
    private static Singleton3 singleton3 = null;
    private Singleton3(){}

    public static Singleton3 getInstance(){
        if(singleton3 == null){
            synchronized (Singleton3.class){
                singleton3 = new Singleton3();
            }
        }
        return singleton3;
    }

}
