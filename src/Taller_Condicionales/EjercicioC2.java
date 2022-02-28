package Taller_Condicionales;
import java.util.Scanner;

public class EjercicioC2 {
    private int edad;
    public void EjercicioC2(){
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
        if(edad<18){
            System.out.println("Usted es aún un niño(a)");
        }
    }
    
}
