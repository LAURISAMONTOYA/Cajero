
package aprobado;

import java.util.Scanner;
public class Aprobado {

   
    public static void main(String[] args) 
        {
            Scanner entrada = new Scanner (System.in);
            
            int calificacion;
            int N;
            int aprobo = 0;
            int reprobo = 0;
            
            
            System.out.println ("Ingrese el numero de  estudiantes");
            N = entrada.nextInt();
            
            for (int i = 1; i<=N; i++)
            {
                System.out.println("Ingrese Calificaciones");
                calificacion = entrada.nextInt ();
                if (calificacion >= 60)
                {
                    aprobo = aprobo +1;
                }
                else 
                {
                    reprobo = reprobo +1;
                }
                
              }
               System.out.println("El total de estudiantes que aprobados es"+" "+aprobo);
               System.out.println("El total de estudiantes que reprobados es"+" "+reprobo);
        }
}
