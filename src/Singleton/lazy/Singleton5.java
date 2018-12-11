package Singleton.lazy;

/**
 * 懒汉式，线程安全，静态内部类实现方式，只有再调用getInstance方法的时候才会实例化
 */
public class Singleton5 {

    private Singleton5(){}

    private static class SingletonHandler{
        private static Singleton5 singleton5 = new Singleton5();
    }

    public static Singleton5 getInstance(){
        return SingletonHandler.singleton5;
    }


}
