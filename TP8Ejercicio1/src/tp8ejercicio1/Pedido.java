
package tp8ejercicio1;

import java.util.ArrayList;

public class Pedido implements Pagable{
    private ArrayList<Producto> productos = new ArrayList<>();
    private String estado = "Pendiente";
    private Notificable cliente;
    
    public Pedido(Notificable cliente){
        this.cliente = cliente;
    }
    
    public void agregarProducto(Producto p){
        productos.add(p);
    }
    
    @Override
    public double calcularTotal(){
        double total = 0;
        for (Producto p : productos) {
            total += p.calcularTotal();
        }
        return total;
    }
    
    public void cambiarEstado(String nuevoEstado){
        this.estado = nuevoEstado;
        cliente.notificarCambio("El pedido cambio su estado a " + nuevoEstado);
    }
    
    public String getEstado(){
        return estado;
    }
}
