package proxy;

import inter.ICuenta;
import inter.impl.CuentaBancoAImpl;
import model.Cuenta;

public class CuentaProxy implements ICuenta {

    private CuentaBancoAImpl cuentaReal;

    @Override
    public Cuenta retirarDinero(Cuenta cuenta, double monto) {
        /* MODIFICACIONES EN PROXY */
        if (cuentaReal == null)
            cuentaReal = new CuentaBancoAImpl();

        return cuentaReal.retirarDinero(cuenta, monto);
    }

    @Override
    public Cuenta depositarDinero(Cuenta cuenta, double monto) {
        /* MODIFICACIONES EN PROXY */
        if (cuentaReal == null)
            cuentaReal = new CuentaBancoAImpl();

        return cuentaReal.depositarDinero(cuenta, monto);
    }

    @Override
    public void mostrarSaldo(Cuenta cuenta) {
        /* MODIFICACIONES EN PROXY */
        if (cuentaReal == null)
            cuentaReal = new CuentaBancoAImpl();

        cuentaReal.mostrarSaldo(cuenta);
    }

}
