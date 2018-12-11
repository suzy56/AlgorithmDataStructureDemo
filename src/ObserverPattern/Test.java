package ObserverPattern;

import ObserverPattern.dao.ObjectFor3D;
import ObserverPattern.dao.Observer1;
import ObserverPattern.dao.Observer2;


//观察者模式
public class Test {
    public static void main(String[] args) {
        ObjectFor3D subjectFor3d = new ObjectFor3D();
        Observer observer1 = new Observer1(subjectFor3d);
        Observer observer2 = new Observer2(subjectFor3d);

        subjectFor3d.setMsg("20181009期：655");
        subjectFor3d.setMsg("20181009期：233");

    }
}
