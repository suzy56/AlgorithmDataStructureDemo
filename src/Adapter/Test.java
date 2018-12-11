package Adapter;

public class Test {

    public static void main(String[] args) {
        V5power v5 = new V5Adapter(new V220power());
        v5.providePower();
    }

}
