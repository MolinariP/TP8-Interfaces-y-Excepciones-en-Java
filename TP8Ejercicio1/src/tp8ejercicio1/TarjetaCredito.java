
package tp8ejercicio1;

public class TarjetaCredito implements PagoConDescuento{
    private String titular;
    
    public TarjetaCredito(String titular){
        this.titular = titular;
    }
    
    @Override
    public double aplicarDescuento(double monto){
        return monto * 0.90;
    }
    
    @Override
    public void procesarPago(double monto){
        System.out.println("Procesando pago con tarjeta de " + titular + " por $" + monto);
    }
}
