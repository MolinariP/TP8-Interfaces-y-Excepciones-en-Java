
package tp8ejercicio2_1;

import java.util.Scanner;

public class TP8Ejercicio2_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try {
            System.out.println("Ingrese el numerador: ");
            int num = sc.nextInt();
            System.out.println("Ingrese el denominador: ");
            int den = sc.nextInt();
            
            int resultado = num / den;
            System.out.println("El resultado es: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir por cero");
        } finally {
            System.out.println("\nPrograma finalizado.");
        }
    }
}
