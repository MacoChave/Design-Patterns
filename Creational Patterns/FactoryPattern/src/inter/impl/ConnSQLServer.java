package inter.impl;

import inter.IConexion;

public class ConnSQLServer implements IConexion {

    private String host;
    private String puerto;
    private String usuario;
    private String contrasena;

    public ConnSQLServer() {
        this.host = "localhost";
        this.puerto = "1433";
        this.usuario = "server";
        this.contrasena = "123";
    }

    @Override
    public void conectar() {
        /* Codigo JDBC */
        System.out.println("Se conectó a SQL Server");
    }

    @Override
    public void desconectar() {
        System.out.println("Se desconectó");
    }
}
