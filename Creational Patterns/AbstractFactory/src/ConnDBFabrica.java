import inter.FabricaAbstracta;
import inter.IConexionDB;
import inter.IConexionREST;
import inter.impl.*;

public class ConnDBFabrica implements FabricaAbstracta {

    @Override
    public IConexionDB getDB(String motor) {
        if (motor == null)
            return new ConnVacia();
        if (motor.equalsIgnoreCase("MYSQL"))
            return new ConnMySQL();
        if (motor.equalsIgnoreCase("ORACLE"))
            return new ConnOracle();
        if (motor.equalsIgnoreCase("POSTGRE"))
            return new ConnPostgreSQL();
        if (motor.equalsIgnoreCase("SQL"))
            return new ConnSQLServer();

        return new ConnVacia();
    }

    @Override
    public IConexionREST getREST(String area) {
        return null;
    }

}
