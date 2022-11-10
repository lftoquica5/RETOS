package retos;

import java.util.Random;
import java.util.Scanner;

public class reto5 {

    /*Cara o sello estructuras ciclicas */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random aleatorio = new Random();

        int Cara = 1, Sello = 2;
        int Ciclo = 1;
        int Plata;
        int Veces_jugadas = Ciclo;
        int Ganancias = 0;
        int Perdidas = 0;
        int Inversion = 0;

        while (Ciclo == 1) {

            int opcion;
            System.out.println("JUEGO DE CARA O SELLO");
            System.out.println("Si ganas, ganas el doble de lo que apuestas, si pierdes pierdes lo apostado");
            System.out.println("");
            System.out.println("Cuanta plata quiere apostar");
            Plata = sc.nextInt();
            System.out.println("");
            System.out.println("Escoje una opcion : \n1 Cara" + "\n2 Sello");
            opcion = sc.nextInt();
            int programa = 1 + aleatorio.nextInt(2);
            if (programa == 1) {
                System.out.println("La maquina ha escogido Cara");
            } else if (programa == 2) {
                System.out.println("La maquina ha escogido Sello");
            }

            if (opcion == Cara) {
                System.out.println("Tu Has escogido Cara");
                if (programa == Cara) {
                    System.out.println("Ganaste");
                    Ganancias = Ganancias + (Plata * 2);
                    System.out.println("Ganancias: " + Ganancias / 2);
                } else if (programa == Sello) {
                    System.out.println("Perdiste");
                    Perdidas = Perdidas - Plata;
                    System.out.println("Perdidas: " + Perdidas);
                }
            } else if (opcion == Sello) {
                System.out.println("Tu has escogido Sello");

                if (programa == Sello) {
                    System.out.println("Ganaste");
                    Ganancias = Ganancias + (Plata * 2);
                    System.out.println("Ganancias: " + Ganancias / 2);
                } else if (programa == Cara) {
                    System.out.println("Perdiste");
                    Perdidas = Perdidas - Plata;
                    System.out.println("Perdidas: " + Perdidas);
                }
            }
            System.out.println("Veces jugadas: " + Veces_jugadas);
            Inversion = Inversion + Plata;
            System.out.println(
                    "En total invertiste: " + Inversion + ", perdiste: " + Perdidas + " y ganaste: " + Ganancias);
            System.out.println("¿Seguir jugando?");
            System.out.println("");
            System.out.println("Selecciona \n1 para seguir Jugando \n2  para Salir");
            System.out.println("");
            Ciclo = sc.nextInt();
            Veces_jugadas += 1;
        }
        sc.close();
    }
}
