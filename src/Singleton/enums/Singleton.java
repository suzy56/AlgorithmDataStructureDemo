package Singleton.enums;

public enum  Singleton implements MySingleton{
    SINGLETON {
        //@Override
        public void doSomething() {
            System.out.println("haha");
        }
    };

    private Singleton(){}

    public void doSomething2() {
        System.out.println("haha2");
    }

    public static MySingleton getInstance(){
        return SINGLETON;
    }
}
