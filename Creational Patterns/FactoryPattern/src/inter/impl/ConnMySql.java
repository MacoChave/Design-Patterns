package inter.impl;

import inter.IConexion;

public class ConnMySql implements IConexion {

    private String host;
    private String puerto;
    private String usuario;
    private String contrasena;

    public ConnMySql() {
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
