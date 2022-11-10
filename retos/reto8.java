package retos;
import java.util.Scanner;
/*COMPETENCIA DE NATACION */
public class reto8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
            String nombre;
            double tiempo;
            int i = 0;

            System.out.println("COMPETENCIA DE NATACION");
            System.out.print("Cuantos atletas van a participar: ");
            int atletas = sc.nextInt();
            String[] atleta = new String[(int) atletas];
            double[] tiempox = new double[(int) atletas];
            
            System.out.print("Nombre Atleta " + (i + 1) + ": ");
            atleta[i] = sc.next();
            System.out.print("Tiempo en competencia: ");
            tiempox[i] = sc.nextDouble();

            tiempo = tiempox[i];
            nombre = atleta[i];

            for (i = 1; i < atleta.length; i++) {
                sc.nextLine();
                System.out.print("Nombre Atleta  " + (i + 1) + ": ");
                atleta[i] = sc.nextLine();
                System.out.print("Tiempo en competencia: ");
                tiempox[i] = sc.nextDouble();

                if (tiempox[i] < tiempo) {
                    tiempo = tiempox[i];
                    nombre = atleta[i];
       }
    }
            System.out.println("Atleta con menor tiempo: " + nombre);
            System.out.println("Hiciste " + tiempo + " Segundos, es el menor tiempo en competencia");
            System.out.print(" ");
            System.out.println("¡¡¡" + nombre + " Ganaste !!!");

            sc.close();
   }
}

