package inter.impl;

import inter.IConexionREST;

public class ConnRESTCompra implements IConexionREST {

    @Override
    public void leerURL(String url) {
        System.out.println("Conectándose a " + url);
    }

}
