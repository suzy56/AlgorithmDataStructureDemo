package Singleton;

/*import Singleton.enums.MySingleton;
import Singleton.enums.Singleton;*/

import Singleton.non_lazy.Singleton;

public class Test {

    public static void main(String[] args) {
        //Singleton.SINGLETON.doSomething2();
        //MySingleton ms = Singleton.getInstance();
        //ms.doSomething();
        Singleton singleton = Singleton.getInstance();
        singleton.doSomething();
        singleton.doSomething();
        singleton.doSomething();
    }



}
