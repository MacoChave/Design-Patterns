import decorador.BlindajeDecorador;
import interf.ICuentaBancaria;
import interf.impl.CuentaAhorro;
import model.Cuenta;

/*
* DECORADOR
* Agregar funcionalidad a un objeto existente
* sin modificar su estructura
* */
public class App {

    public static void main (String[] args)
    {
        Cuenta c = new Cuenta(1, "MitoCode");

        ICuentaBancaria cuenta = new CuentaAhorro();
        ICuentaBancaria cuentaBlindada = new BlindajeDecorador(cuenta);

        //cuenta.abrirCuenta(c);
        cuentaBlindada.abrirCuenta(c);
    }

}
