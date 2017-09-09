/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e2;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class E2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan=new Scanner(System.in);
        double n1,n2,n3;
        System.out.println("Digite primer numero");
        n1=scan.nextDouble();
        System.out.println("Digite segundo numero");
        n2=scan.nextDouble();
        System.out.println("Digite tercer numero");
        n3=scan.nextDouble();
        
        System.out.println("La suma es: "+suma(n1, n2, n3));
        
    }
    
    public static double suma(double n1, double n2, double n3){
        return n1+n2+n3;
    }
    
}
