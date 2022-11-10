package retos;
import java.util.Random;
import java.util.Scanner;

public class reto3 {

    /*Lanzamiento de una moneda */

    public static void main(String[] args) {
                
        Scanner sc = new Scanner (System.in);
        Random aleatorio = new Random();
        
            int Cara = 1, Sello = 2;
            
            int opcion;
            System.out.println("JUEGO DE CARA O SELLO");
            System.out.println("Escoje una opcion : \n1 Cara" + "\n2 Sello");
            opcion = sc.nextInt();
            int programa = 1+aleatorio.nextInt(2);
            if(programa == 1) {
                System.out.println("La maquina ha escogido Cara");
            }else if (programa == 2) {
                System.out.println("La maquina ha escogido Sello");
            }           
            if(opcion == Cara) {
                System.out.println("Tu Has escogido Cara");
                if (programa == Cara) {
                    System.out.println("Ganaste");
                }else if (programa == Sello){
                    System.out.println("Perdiste");

                }
            }
            else if(opcion == Sello) {
                System.out.println("Tu has escogido Sello");

                if (programa == Sello) {
                    System.out.println("Ganas");
                }else if(programa == Cara) {
                    System.out.println("Pierdes");
                }
             sc.close();
        }    
    }    
}




    


