package inter.impl;

import inter.IConexionDB;

public class ConnVacia implements IConexionDB {
    @Override
    public void conectar() {
        System.out.println("NO SE ESPECIFICÓ PROVEEDOR");
    }

    @Override
    public void desconectar() {
        System.out.println("NO SE ESPECIFICÓ PROVEEDOR");
    }
}
