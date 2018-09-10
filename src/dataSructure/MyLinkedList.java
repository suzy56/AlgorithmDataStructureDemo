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






}
