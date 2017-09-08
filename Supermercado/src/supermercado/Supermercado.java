/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermercado;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Supermercado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scan=new Scanner(System.in);
        double ventasContado=0;
        double ventasCredito=0;
        double ventasCuotas=0;
        int numVentasContado=0;
        double comisiones=0;
        double venta;
        int op=0;
        while(true){
            System.out.println("Seleccione el tipo de venta: ");
            System.out.println("1. Contado");
            System.out.println("2. Tarjeta de Credito");
            System.out.println("3. A cuotas");
            op=scan.nextInt();
            System.out.println("Digite el monto de la venta");
            venta=scan.nextDouble();
            switch(op){
                case 1:
                    ventasContado+=venta;
                    comisiones+=0.05*venta;
                    numVentasContado++;
                     break;
                
                case 2:
                    ventasCredito+=venta;
                    comisiones+=0.03*venta;
                     break;
                case 3:
                    ventasCuotas+=venta;
                    comisiones+=0.05*venta;
                    
                     break;
            }
            System.out.println("Digite 1 para ingresar otra venta o 0 para terminar");
            op=scan.nextInt();
            
            if(op!=1){
                break;
            }
        }
        
        System.out.println("El numero total de ventas de contado es: "+numVentasContado);
        System.out.println("El monto total de ventas de contado es: "+ventasContado);
        System.out.println("El monto total de ventas a credito es: "+ventasCredito);
        System.out.println("El monto total de ventas a cuotas es: "+ventasCuotas);
        System.out.println("El monto total de comisiones ganadas: "+comisiones);
        
    }
    
}
