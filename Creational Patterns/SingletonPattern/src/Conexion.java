public class Conexion {

    /*
    * Declaración de la variable estática
    * */
    private static Conexion instancia;

    /*
    * Para obtener una instancia del objeto
    * 'static' hace posible el acceso 'Clase.metodo'
    * */
    public static Conexion getInstance() {
        if (instancia == null)
            instancia = new Conexion();

        return instancia;
    }

    /*
    * PARA EVITAR NUEVAS INSTANCIAS CON EL OPERADOR 'new'
    * */
    private Conexion() {
    }

    public void conectar()
    {
        System.out.println("Me conecté a la DB");
    }

    public void desconectar()
    {
        System.out.println("Me desconecté a la DB");
    }
}
