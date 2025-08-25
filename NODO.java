/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pilasestructuras;

/**
 *
 * @author osbaldorubiomorales
 */
public class NODO<T> {
    T data;
    NODO<T> next;
    NODO<T> prev;
    
    public NODO(T data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    } 
}
