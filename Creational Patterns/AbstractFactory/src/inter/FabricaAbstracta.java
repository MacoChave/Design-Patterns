package inter;

public interface FabricaAbstracta {

    IConexionDB getDB (String motor);
    IConexionREST getREST (String area);

}
