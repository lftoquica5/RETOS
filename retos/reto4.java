package retos;

import java.util.Random;
import java.util.Scanner;

public class reto4 {

    /* Piedra papel o tijera */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random aleatorio = new Random();

        int Piedra = 1, Papel = 2, Tijera = 3;
        int opcion;
        System.out.println("JUEGO DE PIEDRA, PAPEL O TIJERA ");
        System.out.println("Escoje una opcion : \n1 Piedra" + "\n2 Papel" + "\n3 Tijera");

        opcion = sc.nextInt();
        int programa = 1 + aleatorio.nextInt(3);
        if (programa == 1) {
            System.out.println("La maquina ha escogido Piedra");
        } else if (programa == 2) {
            System.out.println("La maquina ha escogido Papel");
        } else if (programa == 3) {
            System.out.println("La maquina ha escogido Tijera");
        }
        if (opcion == Piedra) {
            System.out.println("Tu Has escogido Piedra");
            if (programa == Piedra) {
                System.out.println("Empate");
            } else if (programa == Papel) {
                System.out.println("Perdiste");
            } else if (programa == Tijera) {
                System.out.println("Ganaste");
            }
        }
        if (opcion == Papel) {
            System.out.println("Tu Has escogido Papel");
            if (programa == Piedra) {
                System.out.println("Ganaste");
            } else if (programa == Papel) {
                System.out.println("Empate");
            } else if (programa == Tijera) {
                System.out.println("Perdiste");
            }
        }
        if (opcion == Tijera) {
            System.out.println("Tu Has escogido Tijera");
            if (programa == Piedra) {
                System.out.println("Perdiste");
            } else if (programa == Papel) {
                System.out.println("Ganaste");
            } else if (programa == Tijera) {
                System.out.println("Empate");
            }
        }

        sc.close();
    }
}
