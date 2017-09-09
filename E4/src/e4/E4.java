/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e4;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class E4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        String s;
        
        Scanner scan=new Scanner(System.in);
        
        n=scan.nextInt();
        
        BigInteger b;
        
        
        for (int i = 0; i < n; i++) {
            b=fact(scan.nextInt());
            s=b.toString();
            int k=0,j=s.length()-1;
            while(j>=0 && s.charAt(j)=='0'){
                k++;
                j--;
            }
            System.out.println(k);
        }
    }
    
    public static BigInteger fact(int n){
        BigInteger b=new BigInteger("1");
        for(int i=1;i<=n;i++){
            b=b.multiply(new BigInteger(""+i));
           
        }
        
        return b;
    }
    
}
