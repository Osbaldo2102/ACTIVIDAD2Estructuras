/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pilasestructuras;

/**
 *
 * @author osbaldorubiomorales
 */
public class LinkedList<T> {
    private NODO<T> head;
    private NODO<T> tail;
    
    public LinkedList() {
        head = null; 
        tail = null;
    }
    
    public void insertAtEnd(T data) {
        NODO<T> newNODO = new NODO<>(data);
        if (head == null) {
            head = tail = newNODO;
        } else {
            tail.next = newNODO;
            tail = newNODO;
        }
    }
    
    public void insertAtBeginning(T data) {
        NODO<T> newNODO = new NODO<>(data);
        if (head == null) {
            head = tail = newNODO;
        } else {
            newNODO.next = head;
            head = newNODO;
        }
    }
    
    public T removeFromBeginning() {
        if (head == null) return null;
        T data = head.data;
        head = head.next;
        if (head == null) tail = null;
        return data;
    }
    
    public T removeFromEnd() {
        if (head == null) return null;
        if (head == tail) {
            T data = head.data;
            head = tail = null;
            return data;
        }
        NODO<T> current = head;
        while (current.next != tail) {
            current = current.next;
        }
        T data = tail.data;
        tail = current;
        tail.next = null;
        return data;
    }
    
    public T peekFirst() {
        return (head != null) ? head.data : null;
    }
    
    public T peekLast() {
        return (tail != null) ? tail.data : null;
    }
    
    public boolean isEmpty() {
        return head == null;
    }
    
    public void display() {
        if (head == null) {
            System.out.println("(Lista vacia)");
            return;
        }
        NODO<T> temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
