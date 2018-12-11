package Singleton.lazy;

/**
 * 懒汉式，线程安全，双重检验可以防止多次实例化
 */
public class Singleton4 {
    private static Singleton4 singleton4 = null;
    private Singleton4(){}

    public static Singleton4 getInstance(){
        if(singleton4 == null){
            synchronized (Singleton4.class){
                if (singleton4 == null){
                    singleton4 = new Singleton4();
                }
            }
        }
        return  singleton4;
    }



}
