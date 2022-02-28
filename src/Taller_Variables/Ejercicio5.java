package Taller_Variables;

import java.util.Scanner;

public class Ejercicio5 {
    private String nombreMascota, nombreDueno, raza;
    private int edadMascota;
    private Scanner input;
    public void Ejercicio5(){
        input = new Scanner(System.in);
        solicitarNombreDueno();
        nombreDueno = solicitarDatos();
        solicitarNombreMascota();
        nombreMascota = solicitarDatos();
        solicitarRaza(); 
        raza = solicitarDatos();
        solicitarEdadMascota();
        edadMascota = solicitarInt();      
        mensaje(nombreMascota, edadMascota,raza,nombreDueno);
    }
    private void solicitarNombreMascota(){
        System.out.println("Digite el nombre de su mascota");
    }

    private void solicitarEdadMascota(){
        System.out.println("Digite la edad de su mascota en años");
    }
    
    private void solicitarRaza(){
        System.out.println("Digite la raza de su mascota");
    }
    private void solicitarNombreDueno(){
        System.out.println("Digite el nombre completo del dueño de la mascota");
    }

    private String solicitarDatos(){   
        return input.nextLine();
    }    
    
    private int solicitarInt(){
        return input.nextInt();
    }
    private void mensaje(String nombreMascota, int edadMascota, String raza, String nombreDueno){
        System.out.println(nombreMascota+ " es un "+raza+", el cual tiene "+edadMascota+" años y " + nombreDueno+" es actualmente su dueño(a).");
    }
    
}
