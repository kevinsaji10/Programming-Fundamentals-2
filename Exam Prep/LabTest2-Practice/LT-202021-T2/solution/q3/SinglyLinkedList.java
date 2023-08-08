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
        Node<E> sorted = null; 
        Node<E> current = head; 
       
        while (current != null)  { 
            Node<E> next = current.getNext(); 
            sorted = sortedInsert(current, sorted); 
            current = next; 
        } 
        head = sorted; 
    }

    public Node<E> sortedInsert(Node<E> newnode, Node<E> sorted) {   
        if (sorted == null || sorted.getElement().getClass().getName().compareTo(newnode.getElement().getClass().getName()) >= 0) {   
            newnode.setNext(sorted); 
            sorted = newnode;
        } else { 
            Node<E> current = sorted; 
            Node<E> previous = sorted;

            while (current.getNext() != null && current.getElement().getClass().getName().compareTo(newnode.getElement().getClass().getName()) <= 0) {
                previous = current;
                current = current.getNext(); 
            } 

            if (current.getElement().getClass().getName().compareTo(newnode.getElement().getClass().getName()) > 0){
                 newnode.setNext(current);
                 previous.setNext(newnode);                
            } else {
                 current.setNext(newnode); 
                 newnode.setNext(null);
            }
        } 
        return sorted;
    } 
}