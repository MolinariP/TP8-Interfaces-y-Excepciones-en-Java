
package tp8ejercicio2_4;

public class EdadInvalidaException extends Exception{
    public EdadInvalidaException (String mensaje) {
        super(mensaje);
    }
    
    public static void verificarEdad(int edad) throws EdadInvalidaException {
        if (edad < 0 || edad > 120) {
            throw new EdadInvalidaException("La edad " + edad + " no es válida. Debe ser entre 0 y 120.");
        }
    }    
}
