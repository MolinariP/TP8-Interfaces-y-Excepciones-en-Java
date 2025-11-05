
package tp8ejercicio2_5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TP8Ejercicio2_5 {

    public static void main(String[] args) {
            String ruta = "rutaFalsa.txt";
            //String ruta = "C:\\TUP-UTN\\Cuatrimestre II\\Programacion II\\Archivo.txt"; 

        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        } finally {
            System.out.println("\nPrograma finalizado.");
        }
    }
}

