import inter.IConexion;

/*
* Factory
* Devuelve instancias de un objeto especifico
* */
public class main {

    public static void main(String[] args)
    {
        ConexionFabrica fabrica = new ConexionFabrica();

        IConexion conexion1 = fabrica.getConexion("ORACLE");
        conexion1.conectar();
        conexion1.desconectar();

        IConexion conexion2 = fabrica.getConexion("MYSQL");
        conexion2.conectar();
        conexion2.desconectar();

        IConexion conexion3 = fabrica.getConexion("H2");
        conexion3.conectar();
        conexion3.desconectar();
    }
}
