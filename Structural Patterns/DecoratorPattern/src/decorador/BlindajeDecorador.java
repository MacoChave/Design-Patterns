package decorador;

import interf.ICuentaBancaria;
import model.Cuenta;

public class BlindajeDecorador extends CuentaDecorador {

    public BlindajeDecorador(ICuentaBancaria cuentaDecorada) {
        super(cuentaDecorada);
    }

    @Override
    public void abrirCuenta(Cuenta c) {
        cuentaDecorada.abrirCuenta(c);
        agregarBlindaje(c);
    }

    public void agregarBlindaje (Cuenta c)
    {
        System.out.println("Se agregó blindaje a la cuenta del cliente " + c.getCliente());
    }
}
