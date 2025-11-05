
package tp8ejercicio1;

public class Main {

    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Juan Perez");
        Pedido pedido1 = new Pedido(cliente1);
        
        pedido1.agregarProducto(new Producto("Tostadora electrica", 40000));
        pedido1.agregarProducto(new Producto("Balanza digital de cocina", 20000));
        
        
        double total1 = pedido1.calcularTotal();
        System.out.println("Total del pedido: $" + total1);
        
        TarjetaCredito tarjeta1 = new TarjetaCredito("Juan Perez");
        double totalConDescuento = tarjeta1.aplicarDescuento(total1);
        tarjeta1.procesarPago(totalConDescuento);
        
        pedido1.cambiarEstado("Enviado");
        
        System.out.println("");
        
        Cliente cliente2 = new Cliente("Maria Garcia");
        Pedido pedido2 = new Pedido(cliente2);
        
        pedido2.agregarProducto(new Producto("TV QLed 65 pulgadas", 1650000));
        pedido2.agregarProducto(new Producto("Soporte para TV 65 pulgadas", 50000));
        
        
        double total2 = pedido2.calcularTotal();
        System.out.println("Total del pedido: $" + total2);
        
        Paypal paypal1 = new Paypal("Maria.Garcia.Paypal");
        //double totalConDescuento = tarjeta1.aplicarDescuento(total2);
        paypal1.procesarPago(total2);
        
        pedido2.cambiarEstado("Pagado");
    }
}
