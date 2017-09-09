/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e3;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class E3 {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan=new Scanner(System.in);
        double n1,n2,n3;
        n1=scan.nextDouble();
        n2=scan.nextDouble();
   
        
        System.out.println((int)suma(n1, n2));
        
    }
    
    public static double suma(double n1, double n2){
        return n1+n2;
    }
    
    
}
