package model;

import inter.ICuenta;

public class CuentaAhorro implements ICuenta {

    private String tipo;
    private double monto;

    public CuentaAhorro() {
        tipo = "AHORRO";
    }

    @Override
    public ICuenta clonar() {
        CuentaAhorro cuenta = null;

        try {
            cuenta = (CuentaAhorro) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return cuenta;
    }

    @Override
    public String toString() {
        return "CuentaAhorro{" +
                "tipo='" + tipo + '\'' +
                ", monto=" + monto +
                '}';
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }
}
