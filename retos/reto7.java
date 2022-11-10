package retos;

import java.util.Scanner;

/*cantidad de notas a evaluar*/
public class reto7 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
            float notas;
            float suma = 0;
            int i = 0;
            System.out.println("CALCULADORA DE NOTAS");
            System.out.println("Ingresar la cantidad de notas a promediar");
            notas = sc.nextFloat();
            float cantidad[] =new float[(int)notas];
             
            System.out.println("Ingrese nota "+ (i + 1) + ": ");
                cantidad[i] = sc.nextFloat(); 
                suma = suma + cantidad[i];

            for( i=1;i<notas;i++)
            {
                System.out.println("Ingrese nota " + (i + 1) + ": ");
                cantidad[i] = sc.nextFloat(); 
                suma = suma + cantidad[i];
            }      
            float promedio = suma/notas ;
            System.out.println("El promedio es: " + promedio);

            if(promedio<3) {
                System.out.println("Reprobaste  ");
            }
            else if(promedio >=3 || promedio<=4) {
                System.out.println("Pasaste raspando ");
            }
            else if(promedio>4) {            
                System.out.println("Aprobaste con buenos resultados ");
            }
            sc.close();
        
    }
}
     

    