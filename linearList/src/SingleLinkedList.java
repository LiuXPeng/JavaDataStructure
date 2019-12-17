import java.util.List;

//单链表
public class SingleLinkedList <T> {

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


    public Node getfirst() {
        return head;
    }

    public Node getlast() {
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

    public void removefirst() {
        this.head = this.head.next;
    }

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

    public void addfirst(T o) {
        Node newfirst = new Node(o);
        newfirst.next = this.head;
        this.head = newfirst;
    }

    public void addlast(T o) {
        if (getfirst().data == null) {
            getfirst().data = o;
            return;
        }
        this.getlast().next = new Node(o);
    }

    public boolean contains(T o) {
        Node cur = getfirst();
        while (cur != null) {
            if (cur.data == o) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    public int size() {
        Node cur = getfirst();
        int length = 0;
        while (cur != null) {
            length += 1;
            cur = cur.next;
        }
        return 0;
    }

//    public boolean add(T o) {
//        return false;
//    }

    public boolean remove(T o) {
        if (getfirst().data == o) {
            removefirst();
            return true;
        }
        Node pre = getfirst();
        Node cur = pre.next;
        while (cur != null) {
            if (cur.data == o) {
                pre.next = cur.next;
                return true;
            }
            pre = cur;
            cur = cur.next;
        }
        return false;
    }

    public void addall(List c) {

    }

    public void addall(List c) {

    }

    public boolean addall(int index, List c) {
        return false;
    }

    public void clear() {

    }

    public Object get(int index) {
        return null;
    }

    public void set(int index, Object o) {

    }

    public void add(int index, Object o) {

    }

    public void remove(int index) {

    }

    public int indexof(Object o) {
        return 0;
    }

    public int lastindexof(Object o) {
        return 0;
    }
}
