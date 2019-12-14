import java.util.List;

public abstract class LinearList <T>{
    private abstract class Node {}
//    public abstract void linklist();
//    public abstract void linklist(List<T> c);
    public abstract T getfirst();
    public abstract T getlast();
    public abstract T removefirst();
    public abstract T removelast();
    public abstract void addfirst(T o);
    public abstract void addlast(T o);
    public abstract boolean contains(T o);
    public abstract int size();
    public abstract boolean add(T o);
    public abstract boolean remove(T o);
    public abstract void addall(List<T> c);
    public abstract boolean addall(int index, List<T> c);
    public abstract void clear();
    public abstract T get(int index);
    public abstract void set(int index, T o);
    public abstract void add(int index, T o);
    public abstract void remove(int index);
    public abstract int indexof(T o);
    public abstract int lastindexof(T o);
}
