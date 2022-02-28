package Taller_Variables;

import java.util.Scanner;

public class Ejercicio1 {
    private String nombre;
    private String apellidos;

    public void Ejercicio1(){
        solicitarNombre();
        nombre = solicitarDatos();
        solicitarApellidos();
        apellidos = solicitarDatos();
    }
    private void solicitarNombre(){
        System.out.println("Ingrese su nombre");
    }

    private void solicitarApellidos(){
        System.out.println("Ingrese sus apellidos");
    }

    private String solicitarDatos(){
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }    
}
