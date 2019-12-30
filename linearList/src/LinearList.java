import java.util.List;

public abstract class LinearList {
    private abstract class Node {}
//    public abstract void linklist();
//    public abstract void linklist(List<T> c);
    public abstract Object getfirst();
    public abstract Object getlast();
    public abstract void removefirst();
    public abstract void removelast();
    public abstract void addfirst(Object o);
    public abstract void addlast(Object o);
    public abstract boolean contains(Object o);
    public abstract int size();
    public abstract boolean add(Object o);
    public abstract boolean remove(Object o);
    public abstract void addall(List c);
    public abstract boolean addall(int index, List c);
    public abstract void clear();
    public abstract Object get(int index);
    public abstract boolean set(int index, Object o);
    public abstract boolean add(int index, Object o);
    public abstract boolean remove(int index);
    public abstract int indexof(Object o);
    public abstract int lastindexof(Object o);
}
