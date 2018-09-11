package dataSructure;

public class MyLinkedList<E> {
    class Node<e> {
        private E e; //节点中存放的数据
        Node<E> next; //存在下一个节点的指针

        Node(){}

        Node(E e){
            this.e = e;
        }

        void addNext(Node<E> node){
            next = node;
        }
    }


    private Node<E> header = null; //头结点
    int size = 0; //表示数组大小的指标

    public MyLinkedList(){
        this.header = new Node<E>();
    }

    public boolean add(E e){
        if (size == 0){
            header.e = e;
        }else {
            //根据需要添加的内容，封装为节点
            Node<E> newNode = new Node<E>(e);
            // 得到当前最后一个节点
            Node<E> last = getNode(size-1);
            // 在最后一个节点加上新节点
            last.addNext(newNode);
        }
        size++; //当前大小自增
        return true;
    }

    public boolean insert(int index,E e){
        Node<E> newNode = new Node<E>(e);
        Node<E> cNode = getNode(index);
        newNode.next = cNode.next;
        cNode.next = newNode;
        size++;
        return true;
    }

    private Node<E> getNode(int index) {
        //先判断索引正确性
        if(index >= size || index < 0){
            throw new RuntimeException("索引值非法："+index);
        }
        Node<E> tem = new Node<E>();
        tem = header;
        int count = 0;
        while (count != index){
            tem = tem.next;
            count++;
        }
        return tem;
    }

    public E get(int index){
        //先判断索引正确性
        if(index >= size || index < 0){
            throw new RuntimeException("索引值非法："+index);
        }
        Node<E> tem = new Node<E>();
        tem = header;
        int count = 0;
        while (count != index){
            tem = tem.next;
            count++;
        }
        E e = tem.e;
        return e;
    }

    public int size(){
        return size;
    }

    public boolean set(int index,E e){
        //先判断索引正确性
        if(index >= size || index < 0){
            throw new RuntimeException("索引值非法："+index);
        }
        //得到第X个结点
        Node<E> cNode = getNode(index);
        cNode.e = e;
        return true;
    }
}
