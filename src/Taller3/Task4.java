package Taller3;

import java.util.Scanner;

public class Task4 {
    public static void tiendaRopa(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor indica el tipo de prenda que deseas comprar: ");
        String tipoPrenda = scanner.nextLine();

        double valorPrenda ;

        switch (tipoPrenda.toLowerCase()){
            case "camisa":
                tipoPrenda = "Camisa";
                valorPrenda = 45000;
                break;
            case "pantalon":
                tipoPrenda = "Pantalon";
                valorPrenda = 50000;
                break;
            default:
                tipoPrenda = "Chaqueta";
                valorPrenda = 100000;
        }

        System.out.println("Por favor indique la cantidad de prendas compradas: ");
        int cantidadPrendas = scanner.nextInt();

        double valorTotal = valorPrenda * cantidadPrendas;

        if (cantidadPrendas > 5){
            valorTotal = valorTotal*0.75;
        }
        System.out.println("Las prendas que compraste son: " + tipoPrenda);
        System.out.println("La cantidad de prendas que compró : " + cantidadPrendas);
        System.out.println("El valor total a pagar es: " + valorTotal);





    }
}
