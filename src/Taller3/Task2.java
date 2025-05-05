package Taller3;

import java.util.Scanner;

public class Task2{
    public static void veterinaria(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor indica que tipo de animal es tu mascota: ");
        String animal = scanner.nextLine();
        String veterinario = "";
        switch (animal.toLowerCase()){
            case "perro":
                veterinario = "Veterinario Juan especialista en perros";
                break;
            case "gato":
                veterinario = "Veterinario Pedro especialista en gatos";
                break;
            case "ave":
                veterinario = "Veterinario Julio especialista en aves";
                break;
            default:
                veterinario = "Veterinaria Ana especialista en otras mascotas";
        }

        System.out.println("Por favor indica la edad de tu mascota: ");
        int edad = scanner.nextInt();

        if (edad > 5){
            System.out.println("Se recomienda aplicar vacunación adicional");
        }
           System.out.println("El veterinario asignado es : " + veterinario);
    }
}
