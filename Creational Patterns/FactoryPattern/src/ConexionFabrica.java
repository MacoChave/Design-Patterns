import inter.IConexion;
import inter.impl.*;

public class ConexionFabrica {

    public IConexion getConexion (String motor)
    {
        if (motor == null)
            return new ConnVacia();
        if (motor.equalsIgnoreCase("MYSQL"))
            return new ConnMySql();
        if (motor.equalsIgnoreCase("ORACLE"))
            return new ConnOracle();
        if (motor.equalsIgnoreCase("POSTGRE"))
            return new ConnPostgreSQL();
        if (motor.equalsIgnoreCase("SQL"))
            return new ConnSQLServer();

        return new ConnVacia();
    }
}
