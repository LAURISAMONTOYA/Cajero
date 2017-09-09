/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e5;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class E5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        Scanner scan = new Scanner(System.in);

        while (scan.hasNext()) {
            n = scan.nextInt();
            boolean prime = true;
            if (n <= 1) {
                prime = false;
            } else {
                for (int i = 2; i < n / 2; i++) {
                    if (n % i == 0) {
                        prime = false;
                        break;
                    }
                }
            }
            if (prime) {
                System.out.println("PRIME");
            } else {
                System.out.println("NOT PRIME");

            }

        }

    }

}
