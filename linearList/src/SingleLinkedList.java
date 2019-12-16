import java.util.List;

//单链表
public class SingleLinkedList <T> extends LinearList{

    private Node head;

    private class Node {
        private T data = null;
        private Node next = null;
        public Node (T t) {
            this.data = t;
        }
    }


//    @Override
//    public void linklist() {
//
//    }
//
//    @Override
//    public void linklist(List c) {
//
//    }

    public SingleLinkedList (T c) {
        this.head = new Node(c);
    }

    public SingleLinkedList () {
        this.head = new Node(null);
    }


    @Override
    public Object getfirst() {
        return head;
    }

    @Override
    public Object getlast() {
        if (this.head.next == null) {
            return head;
        }
        Node pre = this.head;
        Node cur = pre.next;
        while (cur != null) {
            pre = cur;
            cur = cur.next;
        }
        return pre;
    }

    @Override
    public Object removefirst() {
        this.head = this.head.next;
        return null;
    }

    @Override
    public void removelast() {
        if (this.head.next == null) {
            this.removefirst();
            return;
        }
        Node pre = this.head;
        Node cur = pre.next;
        while (cur.next != null) {
            pre = cur;
            cur = cur.next;
        }
        pre.next = null;
    }
    
    @Override
    public void addfirst(T o) {
        Node newfirst = new Node(o);
        newfirst.next = this.head;
        this.head = newfirst;
    }

    @Override
    public void addlast(Object o) {
        Object oldlast = this.getlast();
        oldlast.next = o;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean add(Object o) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public void addall(List c) {

    }

    @Override
    public void addall(List c) {

    }

    @Override
    public boolean addall(int index, List c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public Object get(int index) {
        return null;
    }

    @Override
    public void set(int index, Object o) {

    }

    @Override
    public void add(int index, Object o) {

    }

    @Override
    public void remove(int index) {

    }

    @Override
    public int indexof(Object o) {
        return 0;
    }

    @Override
    public int lastindexof(Object o) {
        return 0;
    }
}
