package dataSructure;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class HashTest {
    private int i;

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    @Override
    public int hashCode() {
        return this.i % 10;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;  // 地址引用相等返回true
        if (o == null || getClass() != o.getClass()) return false;  //判断类是否相同，等同于instance判断，不相同则返回false

        HashTest hashTest = (HashTest) o;

        return i == hashTest.i;
    }

    public static void main(String[] args) {
        HashTest h1 = new HashTest();
        h1.setI(1);
        HashTest h2 = new HashTest();
        h2.setI(1);
        ArrayList l1;
        Set<HashTest> set = new HashSet<HashTest>();
        set.add(h1);
        set.add(h2);
        System.out.println(h1.hashCode() == h2.hashCode());
        System.out.println(h1.equals(h2));
        System.out.println(set);
    }

}
