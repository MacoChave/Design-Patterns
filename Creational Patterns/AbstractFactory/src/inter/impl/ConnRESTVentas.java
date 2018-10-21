package inter.impl;

import inter.IConexionREST;

public class ConnRESTVentas implements IConexionREST {

    @Override
    public void leerURL(String url) {
        System.out.println("Conectandose a " + url);
    }

}
