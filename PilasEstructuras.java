/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pilasestructuras;
import java.util.Scanner;
/**
 *
 * @author osbaldorubiomorales
 */
public class PilasEstructuras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pila<String> pilaComandos = new Pila<>();
        Cola<String> colaProcesos = new Cola<>();

        boolean continuar = true;

        while (continuar) {
            System.out.println("\n--- Menú ---");
            System.out.println("1. Apilar comando (PILA)");
            System.out.println("2. Desapilar comando (PILA)");
            System.out.println("3. Mostrar pila de comandos");
            System.out.println("4. Encolar proceso (COLA)");
            System.out.println("5. Procesar (desencolar) proceso (COLA)");
            System.out.println("6. Mostrar cola de procesos");
            System.out.println("7. Salir");
            System.out.print("Opción: ");
            int opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1 -> {
                    System.out.print("Ingrese comando (ej: DIR, LS, CD): ");
                    String cmd = sc.nextLine();
                    pilaComandos.push(cmd);
                }
                case 2 -> {
                    String cmd = pilaComandos.pop();
                    System.out.println(cmd != null ? "Comando ejecutado: " + cmd : "La pila está vacía.");
                }
                case 3 -> {
                    System.out.println("Pila de comandos:");
                    pilaComandos.display();
                }
                case 4 -> {
                    System.out.print("Ingrese proceso (ej: Chrome, Spotify, Word): ");
                    String proc = sc.nextLine();
                    colaProcesos.enqueue(proc);
                }
                case 5 -> {
                    String proc = colaProcesos.dequeue();
                    System.out.println(proc != null ? "Proceso atendido: " + proc : "No hay procesos en la cola.");
                }
                case 6 -> {
                    System.out.println("Cola de procesos:");
                    colaProcesos.display();
                }
                case 7 -> continuar = false;
                default -> System.out.println("Opción inválida.");
            }
        }
        sc.close();
    }
}
    

