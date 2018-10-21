import commands.Cuenta;
import commands.DepositarImpl;
import commands.Invoker;
import commands.RetirarImpl;

/*
* Comando
* Encapsula la petición de una operación bajo un método
* Se accede a través de una caja negra
* */
public class App {

    public static void main (String[] args)
    {
        Cuenta cuenta = new Cuenta(1, 200);

        DepositarImpl opDepositar = new DepositarImpl(cuenta, 100);
        RetirarImpl opRetirar = new RetirarImpl(cuenta, 50);

        Invoker invoker = new Invoker();
        invoker.recibirOperacion(opDepositar);
        invoker.recibirOperacion(opRetirar);

        invoker.realizarOperaciones();
    }
}
