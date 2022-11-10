package retos;

import java.util.Scanner;

public class reto6 {

    /*Comprar n cantidad */
    public static void main(String[] args) {

        int cantidad, precio;
        int total = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Productos a registrar");
        cantidad = scanner.nextInt();

        for (int i = 1; i <= cantidad; i++) {

            System.out.println("Precio del producto Numero " + i);
            precio = scanner.nextInt();

            total = total + precio;

        }
        System.out.println("Productos comprados " + cantidad);
        System.out.println("Total: $" + total);

        scanner.close();

    }
}

