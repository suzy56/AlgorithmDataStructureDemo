package dataSructure;

import java.util.ArrayList;

public class MyArrayList<E> {
    Object[] data = null; // 保存对象的数组
    int current; //数组当前游标
    int capacity; //数组大小

    public MyArrayList(){
        this(10);
    }

    public MyArrayList(int initalSize) {
        if(initalSize < 0){
            throw new RuntimeException("数组大小错误："+initalSize);
        }else{
            this.data = new Object[initalSize];
            this.current = 0;
            this.capacity = initalSize;
        }
    }

    public boolean add(E e){
        ensureCapacity(current);
        this.data[current] = e;
        current++;
        return true;
    }

    private void ensureCapacity(int cur) {
        if(cur == capacity){
            this.capacity += 10; //达到容量，增加10，复制当前数组
            Object[] newData = new Object[capacity];
            for (int i=0; i < cur; i++){
                newData[i] = this.data[i];
            }
            this.data = newData;
        }
    }

    public E get(int index){
        //验证index是否合法
        validateIndex(index);
        return (E)this.data[index];
    }

    private void validateIndex(int index) {
        if(index < 0 || index >= current){
            throw new RuntimeException("数组下标错误："+index);
        }
    }

    public int size(){
        return this.current;
    }

    public boolean set(int index,E e){
        validateIndex(index);
        this.data[index] = e;
        return true;
    }

    public boolean insert(int index,E e){
        validateIndex(index);
        System.arraycopy(data, index, data, index + 1,
                current - index);
        data[index] = e;
        current++;
        return true;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < current; i++){
            sb.append(data[i]);
            sb.append(",");
        }
        return "[" +sb+ "]";
    }

    public static void main(String[] args) {
        MyArrayList<Integer> a = new MyArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);
        a.insert(1,8);
        b.add(1);
        System.out.println(a);
        //System.out.println(b.get(1));
    }
}
