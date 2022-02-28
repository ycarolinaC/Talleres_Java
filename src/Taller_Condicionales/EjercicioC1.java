package Taller_Condicionales;
import java.util.Scanner;
public class EjercicioC1 {
    private int edad;
    public void EjercicioC1(){
        solicitarEdad();
        edad = solicitarDatos();
        revisarEdad(edad);
    }
    
    private void solicitarEdad(){
        System.out.println("Ingrese su edad");
    }

    private int solicitarDatos(){
        Scanner input = new Scanner(System.in);
        return input.nextInt();
        
    }

    private void revisarEdad(int edad){
        if(edad>=18){
            System.out.println("Usted es mayor de edad");
        }
    }

}
