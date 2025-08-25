/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pilasestructuras;

/**
 *
 * @author osbaldorubiomorales
 */
public class Pila<T> {
   private LinkedList<T> lista = new LinkedList<>();
  
   public void push(T data) {
       lista.insertAtBeginning(data);
   }
   
   public T pop() {
       return lista.removeFromBeginning();
   }
   
   public T peek() {
       return lista.peekFirst();
   }
   
   public boolean isEmpty() {
       return lista.isEmpty();
   }
   
   public void display() {
       lista.display();
   }
}
