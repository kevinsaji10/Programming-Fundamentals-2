// Name:
// Email ID:

//##############################################################

import java.util.*;

public class SinglyLinkedList<E> {
    private Node<E> head = null;
    private Node<E> tail = null;
    private int size = 0;

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void add(E e){
        Node<E> newest = new Node<>(e, null);
        if (isEmpty()){
            head = newest;
        } else {
            tail.setNext(newest);
        }
        tail = newest;
        size++;
    }

    public String toString(){
        String result = "";
        if (isEmpty()){
            return result;
        }

        Node<E> current = head;
        while (current != null){
            result += current.getElement();
            current = current.getNext();
        }
        return result;
    }

    public void sort(){
        
    }
}