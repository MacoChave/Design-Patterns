import inter.FabricaAbstracta;
import inter.IConexionDB;
import inter.IConexionREST;

/*
* FABRICA ABSTRACTA
* Es una fabrica de fabricas de objetos
* */
public class App {
    public static void main (String[] args)
    {
        FabricaAbstracta fabricaDB = FabricaProductor.getFactory("DB");

        IConexionDB conexionDB1 = fabricaDB.getDB("MYSQL");
        conexionDB1.conectar();

        FabricaAbstracta fabricaREST = FabricaProductor.getFactory("REST");

        IConexionREST conexionREST1 = fabricaREST.getREST("COMPRAS");
        conexionREST1.leerURL("https://www.youtube.com/watch?v=QmE-o5R7ZF4&list=PLvimn1Ins-41Uiugt1WbpyFo1XT1WOquL&index=4");
    }
}
