
package tp8ejercicio2_2;

import java.util.Scanner;

public class TP8Ejercicio2_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try {
            System.out.println("Ingrese un número entero: ");
            String texto = sc.nextLine();
            int num = Integer.parseInt(texto);
            System.out.println("El numero ingresado es: " + num);
        } catch (NumberFormatException e) {
            System.out.println("Error: El número ingresado no es valido");
        } finally {
            System.out.println("\nPrograma finalizado.");
        }
    }
}
