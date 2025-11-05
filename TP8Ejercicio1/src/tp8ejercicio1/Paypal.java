
package tp8ejercicio1;

public class Paypal implements Pago{
    private String cuenta;
    
    public Paypal(String cuenta){
        this.cuenta = cuenta;
    }
    
    @Override
    public void procesarPago(double monto){
        System.out.println("Pago con PayPal (" + cuenta + ") por $" + monto);
    }
}
