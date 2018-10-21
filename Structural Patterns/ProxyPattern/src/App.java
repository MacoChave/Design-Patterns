import inter.ICuenta;
import model.Cuenta;
import proxy.CuentaProxy;

/*
* PROXY
* Encapsula la complejidad
* El cliente interacciona con el envoltorio
* No alterar la lógica, si no, agregar modificaciones en el proxy
* */
public class App {

    public static void main (String[] args)
    {
        Cuenta c = new Cuenta(1, "MitoCode", 100);

        ICuenta cuentaProxy = new CuentaProxy();
        cuentaProxy.mostrarSaldo(c);
        c = cuentaProxy.depositarDinero(c, 50);
        c = cuentaProxy.retirarDinero(c, 20);
        cuentaProxy.mostrarSaldo(c);
    }
}
