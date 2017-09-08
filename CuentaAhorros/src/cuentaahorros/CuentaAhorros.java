/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentaahorros;

/**
 *
 * @author User
 */
public class CuentaAhorros {

    /**
     * @param args the command line arguments
     */
    private double saldo;
    private double interes;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public CuentaAhorros(double saldo, double interes) {
        this.saldo = saldo;
        this.interes = interes;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public void retirar(double val) {
        if (saldo >= val) {
            saldo = saldo - val;
        }
        else{
            System.out.println("Saldo insuficiente");
        }
    }
    public void depositar(double val){
        saldo+=val;
    }

    public void abonarInteres(){
        saldo+=(interes/12)*saldo;        
    }
}
