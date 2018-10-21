import model.CuentaAhorro;

/*
* PROTOTIPO
* Crea una nueva instancia con los valores
* clonados de otra instancia
* */
public class App {

    public static void main (String[] args)
    {
        CuentaAhorro cuenta = new CuentaAhorro();
        cuenta.setMonto(200);

        CuentaAhorro cuentaClon = (CuentaAhorro) cuenta.clonar();

        if (cuentaClon != null)
            System.out.println(cuentaClon);

        System.out.println(cuentaClon == cuenta);
    }
}
