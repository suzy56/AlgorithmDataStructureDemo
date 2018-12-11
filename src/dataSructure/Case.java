package dataSructure;

import java.util.concurrent.atomic.AtomicInteger;

public class Case {
    public volatile int n;

    public void add() {
        AtomicInteger a;
        n++;
    }
}
