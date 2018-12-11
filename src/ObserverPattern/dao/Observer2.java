package ObserverPattern.dao;

import ObserverPattern.Observer;
import ObserverPattern.Subject;

public class Observer2 implements Observer {

    private Subject subject;

    public Observer2(Subject subject){
        this.subject = subject;
        subject.registerObserver(this);
    }



    @Override
    public void update(String msg) {
        System.out.println("observer2 得到的3d号码 -->" + msg);
    }
}
