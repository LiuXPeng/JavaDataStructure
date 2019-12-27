import java.util.List;

//单链表
public class SingleLinkedList extends LinearList {

    private Node head;

    private class Node {
        private Object data = null;
        private Node next = null;
        public Node (Object t) {
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

    public SingleLinkedList (Object c) {
        this.head = new Node(c);
    }


    public SingleLinkedList () {
        this.head = new Node(null);
    }

    @Override
    public Node getfirst() {
        return head;
    }

    @Override
    public Node getlast() {
        Node pre = this.head;
        Node cur = pre.next;
        while (cur != null) {
            pre = cur;
            cur = cur.next;
        }
        return pre;
    }

    @Override
    public void removefirst() {
        this.head = this.head.next;
        return;
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
    public void addfirst(Object o) {
        Node newfirst = new Node(o);
        newfirst.next = this.head;
        this.head = newfirst;
    }

    @Override
    public void addlast(Object o) {
        if (getfirst().data == null) {
            getfirst().data = o;
            return;
        }
        this.getlast().next = new Node(o);
    }

    @Override
    public boolean contains(Object o) {
        Node cur = getfirst();
        while (cur != null) {
            if (cur.data == o) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    @Override
    public int size() {
        if (getfirst().next == null && getfirst().data == null) {
            return 0;
        }
        Node cur = getfirst();
        int length = 0;
        while (cur != null) {
            length += 1;
            cur = cur.next;
        }
        return length;
    }

    @Override
    public boolean add(Object o) {
        return false;
    }


    @Override
    public boolean remove(Object o) {
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

    @Override
    public void addall(List c) {
        if (this.size() != 0) {
            Node lastNode = this.getlast();
            for (Object o : c) {
                Node newNode = new Node(o);
                lastNode.next = newNode;
                lastNode = newNode;
            }
        }
        
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
