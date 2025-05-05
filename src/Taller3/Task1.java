package Taller3;

import java.util.Scanner;

public class Task1 {
    public static void superMercado(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa el total de tu compra: ");
        double totalCompra = scanner.nextDouble();

        System.out.println("Ingresa el número de productos que compraste: ");
        int numProduct = scanner.nextInt();

        System.out.println("¿Tienes membresía?, por favor escribe 1 para Si o 2 para No: ");
        int membresia = scanner.nextInt();

         double finalCompra = totalCompra;

        if (membresia == 1 ){
            finalCompra = finalCompra * 0.90;
        }

        if (numProduct > 10);{
             finalCompra = finalCompra* 0.95; };

        System.out.println("El total a pagar es: " + finalCompra);
        scanner.close();
    }
}
