package Singleton.non_lazy;

public class Singleton {
    //饿汉式，线程安全，非延迟加载
    private static Singleton singleton = new Singleton();

    private Singleton(){};

    public static Singleton getInstance(){
        return  singleton;
    }

    private int i=0;

    public void doSomething(){
        System.out.println(i++);
    }

}
