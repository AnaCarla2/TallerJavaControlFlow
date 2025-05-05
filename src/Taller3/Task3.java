package Taller3;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Task3 {
    public static void parqueadero(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor ingrese su tipo de vehiculo: ");
        String vehiculo = scanner.nextLine();

        String tipoVehiculo = "";
        double valorParqueo;

        switch (vehiculo.toLowerCase()){
            case "carro":
                tipoVehiculo = "Carro";
                valorParqueo = 10000;
                break;
            case "moto":
                tipoVehiculo = "Moto";
                valorParqueo = 5000;
                break;
            default:
                tipoVehiculo = "Bicicleta";
                valorParqueo = 2000;
        }

        System.out.println("Por favor indica la hora de llegada en formato 24 hr Ej: las 8 P.M. serian las 20:00: ");
        String hora = scanner.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        LocalTime horaLlegada = LocalTime.parse(hora, formatter);

        LocalTime horaLimite = LocalTime.of(20, 0); // 20:00 horas

        double totalParqueo = valorParqueo;

        if (horaLlegada.isAfter(horaLimite)) {
            totalParqueo += valorParqueo * 0.20; // recargo del 20%
        }
        System.out.println("El valor de la hora de parqueo es : "+ valorParqueo);
        System.out.println("El valor total a pagar es: "+ totalParqueo);



    }
}
