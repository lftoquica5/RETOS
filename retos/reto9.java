package retos;

import java.util.Scanner;

public class reto9 {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String producto;     
        final int filas= 2;
        final int columnas = 2;
        int codigo, precio;
        String [][] prod = new String [filas][columnas];

        System.out.print("AGREGAR PRODUCTOS A LA MAQUINA EXPENDEDORA ");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.println(" ");
                System.out.print("Codigo: ");
                codigo= sc.nextInt();
                System.out.print("Nombre: ");
                producto = sc.next();
                System.out.print("Precio: ");
                precio = sc.nextInt();
                prod[i][j] = " | "
                +codigo+ " "
                +producto+ " "
                +precio + " |";

            }
        }
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(prod[i][j]);
            }
            System.out.println();
        }
        
        
        sc.close();
    }
}