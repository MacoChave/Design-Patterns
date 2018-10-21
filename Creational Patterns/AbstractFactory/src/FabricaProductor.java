import inter.FabricaAbstracta;

public class FabricaProductor {

    public static FabricaAbstracta getFactory (String tipoFabrica)
    {
        if (tipoFabrica.equalsIgnoreCase("DB"))
            return new ConnDBFabrica();
        if (tipoFabrica.equalsIgnoreCase("REST"))
            return new ConnRESTFabrica();

        return null;
    }

}
