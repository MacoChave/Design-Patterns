package inter.impl;

import inter.IConexionDB;

public class ConnOracle implements IConexionDB {

    private String host;
    private String puerto;
    private String usuario;
    private String contrasena;

    public ConnOracle() {
        this.host = "localhost";
        this.puerto = "1521";
        this.usuario = "admin";
        this.contrasena = "123";
    }

    @Override
    public void conectar() {
        /* Codigo JDBC */
        System.out.println("Se conectó a Oracle");
    }

    @Override
    public void desconectar() {
        System.out.println("Se desconectó de Oracle");
    }
}
