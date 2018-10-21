/*
* SINGLETON
* Delimitar a una sola instancia un objeto
* durante toda la aplicación
* */
public class main {
    public static void main (String[] args)
    {
        Conexion c = Conexion.getInstance();
        c.conectar();
        c.desconectar();

        Conexion c1 = Conexion.getInstance();
        c1.conectar();
        c1.desconectar();

        boolean rpta = c instanceof Conexion;
        System.out.println(rpta);
    }
}
