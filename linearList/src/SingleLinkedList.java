import java.util.List;

//单链表
public class SingleLinkedList extends LinearList {

    private Node head;

    private class Node {
        private Object data = null;
        private Node next = null;

        public Node(Object t) {
            this.data = t;
        }

        public Node() {
            this.data = null;
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

    public SingleLinkedList(Object c) {
        this.head = new Node(c);
    }


    public SingleLinkedList() {
        this.head = null;
    }

    @Override
    public Node getfirst() {
        return head;
    }

    @Override
    public Node getlast() {
        if (this.head == null) {
            return null;
        }
        Node cur = this.head;
        while (cur.next != null) {
            cur = cur.next;
        }
        return cur;
    }

    @Override
    public void removefirst() {
        if (this.head != null) {
            this.head = this.head.next;
        }
    }

    @Override
    public void removelast() {
        if (this.head == null) {
            return;
        }

        if (this.head.next == null) {
            this.head = null;
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
        if (this.head == null) {
            Node newlast = new Node(o);
            this.head = newlast;
            return;
        }
        this.getlast().next = new Node(o);
        return;
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
        Node cur = getfirst();
        int length = 0;
        while (cur != null) {
            length += 1;
            cur = cur.next;
        }
        return length;
    }

    @Override
    public void add(Object o) {
        addlast(o);
    }

    @Override
    public boolean remove(Object o) {
        if (getfirst() == null) {
            return false;
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
        if (c.size() == 0) {
            return;
        }
        Node lastNode = null;
        if (this.size() != 0) {
            lastNode = this.getlast();
        } else {
            lastNode = this.head;
        }
        for (Object o : c) {
            Node newNode = new Node(o);
            lastNode.next = newNode;
            lastNode = newNode;
        }
    }

    @Override
    public boolean addall(int index, List c) {
        if (this.size() <= index || c.size() == 0) {
            return false;
        }
        if (this.size() == 0) {
            addall(c);
            return true;
        }
        Node breakPiont = this.head;
        if (index == 0) {
            this.head = new Node(c.get(0));
            Node currentNode = this.head;
            for (int i = 1; i < c.size(); i++) {
                currentNode.next = new Node(c.get(i));
                currentNode = currentNode.next;
            }
            currentNode.next = breakPiont;
            return true;
        }
        for (int i = 1; i < index; i++) {
            breakPiont = breakPiont.next;
        }
        Node BackPointOfbreakPiont = breakPiont.next;
        for (Object o : c) {
            breakPiont.next = new Node(o);
            breakPiont = breakPiont.next;
        }
        breakPiont.next = BackPointOfbreakPiont;
        return true;
    }

    @Override
    public void clear() {
        this.head = null;
    }

    @Override
    public Object get(int index) {
        if (index >= this.size() || index < 0) {
            return null;
        }
        Node node = this.head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node.data;
    }

    @Override
    public boolean set(int index, Object o) {
        if (index >= this.size() || index < 0) {
            return false;
        }
        if (index == 0) {
            this.head.data = o;
            return true;
        }
        Node currentNode = this.head;
        for (int i = 1; i < index; i++) {
            currentNode = currentNode.next;
        }
        currentNode.data = o;
        return true;
    }

    @Override
    public boolean add(int index, Object o) {
        if (index >= this.size() || index < 0) {
            return false;
        }
        Node breakPiont = this.head;
        for (int i = 0; i < index; i++) {
            breakPiont = breakPiont.next;
        }
        Node BackPointOfbreakPiont = breakPiont.next;
        breakPiont.next = new Node(o);
        breakPiont.next.next = BackPointOfbreakPiont;
        return true;
    }

    @Override
    public boolean remove(int index) {
        if (index >= this.size() || index < 0) {
            return false;
        }
        if (index == 0) {
            this.head = this.head.next;
            return true;
        }
        Node breakNode = this.head;
        for (int i = 1; i < index; i++) {
            breakNode = breakNode.next;
        }
        breakNode.next = breakNode.next.next;
        return true;
    }

    @Override
    public int indexof(Object o) {
        Node cur = this.head;
        int index = 0;
        while (cur != null) {
            if (cur.data == o) {
                return index;
            }
            index++;
            cur = cur.next;
        }
        return -1;
    }

    @Override
    public int lastindexof(Object o) {
        Node cur = this.head;
        int result = -1;
        int index = 0;
        while (cur != null) {
            if (cur.data == o) {
                result = index;
            }
            index++;
            cur = cur.next;
        }
        return result;
    }
}
