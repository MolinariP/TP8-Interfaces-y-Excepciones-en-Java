
package tp8ejercicio2_3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TP8Ejercicio2_3 {

    public static void main(String[] args) throws FileNotFoundException {
        try {
            // String ruta = "C:\\Pablo\\Cursos\\TUP-UTN\\Cuatrimestre II\\Programacion II\\Unidad 8 - Interfaces y Excepciones\\Texto.txt";
            String ruta = "archivo.txt";
            
            Scanner sc = new Scanner(new File(ruta));
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: El archivo no existe.");
        } finally {
            System.out.println("\nPrograma finalizado.");
        }  
    } 
}
