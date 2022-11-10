package retos;

import java.util.Scanner;

public class reto1 {

    //*¡La abuela tiene horno nuevo!
    public static void main(String[] args) {
        double Fahrenheit, Centígrados;
        Scanner grados = new Scanner(System.in);

        System.out.println("Ingrese los grados Farenheit que desea convertir a grados centigrados: \n");
        Fahrenheit = grados.nextDouble();

        Centígrados = 0.55556 * (Fahrenheit - 32);

        System.out.println("Los grados en  grados centigrados que debe poner en el horno son :" + Centígrados + "°");
        System.out.println("");

        grados.close();
    }
}
