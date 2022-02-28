package Taller_Variables;

import java.util.Scanner;

public class Ejercicio3 {
    private String nombre, apellidos,nombreMadre, nombrePadre;

    public void Ejercicio3(){
        solicitarNombre();
        nombre = solicitarDatos();
        solicitarApellidos();
        apellidos = solicitarDatos();
        solicitarNombreM();
        nombreMadre=solicitarDatos();
        solicitarNombreP();
        nombrePadre=solicitarDatos();
        mensaje(nombre,apellidos,nombreMadre,nombrePadre);
    }
    private void solicitarNombre(){
        System.out.println("Ingrese su nombre");
    }

    private void solicitarApellidos(){
        System.out.println("Ingrese sus apellidos");
    }
    private void solicitarNombreM(){
        System.out.println("Ingrese el nombre de su madre");
    }
    private void solicitarNombreP(){
        System.out.println("Ingrese el nombre de su padre");
    }
    private String solicitarDatos(){
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }

    private void mensaje(String nombre, String apellidos, String nombreMadre, String nombrePadre){
        System.out.println("Yo "+ nombre + apellidos+", soy hijo(a) de "+nombreMadre +" y "+nombrePadre+".");

    }
    
}
