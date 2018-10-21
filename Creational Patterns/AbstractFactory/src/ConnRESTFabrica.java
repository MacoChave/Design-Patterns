import inter.FabricaAbstracta;
import inter.IConexionDB;
import inter.IConexionREST;
import inter.impl.ConnRESTCompra;
import inter.impl.ConnRESTNoArea;
import inter.impl.ConnRESTVentas;

public class ConnRESTFabrica implements FabricaAbstracta {
    @Override
    public IConexionDB getDB(String motor) {
        return null;
    }

    @Override
    public IConexionREST getREST(String area) {
        if (area == null)
            return new ConnRESTNoArea();
        if (area.equalsIgnoreCase("COMPRAS"))
            return new ConnRESTCompra();
        if (area.equalsIgnoreCase("VENTAS"))
            return new ConnRESTVentas();

        return new ConnRESTNoArea();
    }
}
