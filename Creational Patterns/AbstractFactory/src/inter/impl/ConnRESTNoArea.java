package inter.impl;

import inter.IConexionREST;

public class ConnRESTNoArea implements IConexionREST {

    @Override
    public void leerURL(String url) {
        System.out.println("Area no elegida");
    }

}
