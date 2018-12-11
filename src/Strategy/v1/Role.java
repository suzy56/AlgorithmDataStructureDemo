package Strategy.v1;

public abstract class Role {
    protected String name;

    protected abstract void display();

    protected abstract void attack();

    protected abstract void defend();

    protected abstract void run();
}
