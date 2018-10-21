package inter.impl;

import inter.IConexionDB;

public class ConnMySQL implements IConexionDB {

    private String host;
    private String puerto;
    private String usuario;
    private String contrasena;

    public ConnMySQL() {
        this.host = "localhost";
        this.puerto = "3306";
        this.usuario = "root";
        this.contrasena = "123";
    }

    @Override
    public void conectar() {
        /* CODIGO JDBC */
        System.out.println("Se conectó a MySQL");
    }

    @Override
    public void desconectar() {
        System.out.println("Se desconectó de MySQL");
    }
}
