
package tp8ejercicio2_4;

import java.util.Scanner;

public class TP8Ejercicio2_4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Ingrese una edad: ");
            int edad = sc.nextInt();

            EdadInvalidaException.verificarEdad(edad);

            System.out.println("La edad ingresada: " + edad + " años, es válida.");

        } catch (EdadInvalidaException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Ocurrió un error inesperado: " + e.getMessage());
        } finally {
            sc.close();
            System.out.println("\nPrograma finalizado.");
        }
    }
}
