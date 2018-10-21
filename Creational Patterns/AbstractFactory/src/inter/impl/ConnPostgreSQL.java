package inter.impl;

import inter.IConexionDB;

public class ConnPostgreSQL implements IConexionDB {

    private String host;
    private String puerto;
    private String usuario;
    private String contrasena;

    public ConnPostgreSQL() {
        this.host = "localhost";
        this.puerto = "5433";
        this.usuario = "postgres";
        this.contrasena = "123";
    }

    @Override
    public void conectar() {
        /* Codigo JDBC */
        System.out.println("Se conectó a PostgreSQL");
    }

    @Override
    public void desconectar() {
        System.out.println("Se desconectó de PostgreSQL");
    }
}
