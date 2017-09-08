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
public class CuentaAhorroTest {
    
    
    public static void main(String[] args) {
        CuentaAhorros ahorro1=new CuentaAhorros(200000, 0.04);
        CuentaAhorros ahorro2=new CuentaAhorros(300000, 0.05);
   
        for (int i = 0; i < 13; i++) {
            System.out.println("Mes "+i);
            System.out.println("Saldo Cuenta Ahorros 1: "+ahorro1.getSaldo());
            System.out.println("Saldo Cuenta Ahorros 2: "+ahorro2.getSaldo());
            ahorro1.abonarInteres();
            ahorro2.abonarInteres();
        }
    }
}
