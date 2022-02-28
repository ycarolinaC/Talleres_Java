package Taller_Variables;
import java.util.Scanner;


public class Ejercicio2 {
    private String nombre;
    private String apellidos;
    private int edad; 
    private double altura;
    private Scanner input;
    public void Ejercicio2(){
        input = new Scanner(System.in);
        solicitarNombre();
        nombre = solicitarString();
        solicitarApellidos();
        apellidos=solicitarString();
        solicitarEdad();
        edad=solicitarInt();
        solicitarAltura();
        altura=solicitarDouble();

    }

    private void solicitarNombre(){
        System.out.println("Ingrese su nombre");
    }

    private void solicitarApellidos(){
        System.out.println("Ingrese sus apellidos");
    }
    private void solicitarEdad(){
        System.out.println("Ingrese su edad");
    }
    private void solicitarAltura(){
        System.out.println("Ingrese su altura");
    }
    private String solicitarString(){       
        return input.nextLine();
    }
    private int solicitarInt(){
        return input.nextInt();
    }
    private double solicitarDouble(){
        return input.nextDouble();
    }

    
}
