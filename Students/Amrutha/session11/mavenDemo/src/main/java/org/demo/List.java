package org.demo;

//Object, Double, Integer, Student
public interface List<T> {
    void addTail(T element);
    void navigate();
    void addStart(T element);
    void addMiddle(T element, int index);
    T getByIndex(int index);
}
