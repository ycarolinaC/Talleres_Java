package Taller_Condicionales;
import java.util.Scanner;

public class EjercicioC3 {
    private String nombre, apellidos;
    private int edad;
    private Scanner input;

    public void EjercicioC3(){
        input = new Scanner(System.in);
        solicitarNombre();
        nombre = solicitarString();
        solicitarApellidos();
        apellidos = solicitarString();
        solicitarEdad();
        edad=solicitarInt();
        revisarEdad(nombre, apellidos, edad);
    }

    private void solicitarNombre(){
        System.out.println("Digite su nombre");
    }
    private void solicitarApellidos(){
        System.out.println("Digite sus apellidos");
    }
    private void solicitarEdad(){
        System.out.println("Ingrese su edad");
    }
    private String solicitarString(){
        return input.nextLine();
    }
    private int solicitarInt(){
        return input.nextInt();
    }

    private void revisarEdad(String nombre, String apellidos,int edad){
        if (edad>=18){
            System.out.println(nombre+" " +apellidos+" usted es mayor de edad, por lo tanto puede entrar a la fiesta.");
        }else{
            System.out.println(nombre+" " +apellidos+" sted es menor de edad, por lo tanto, no puede entrar a la fiesta, por favor devuélvase a su casa.");
        }

    }
}
