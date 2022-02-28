package Taller_Arreglos;

import java.util.Scanner;

public class EjercicioA1 {
    int [] datos = new int[5];
    public void EjercicioA1(){
        solicitarNumeros();
        mostrarDatos();

    }
    
    public int solicitarInt(){
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }

    private void solicitarNumeros(){
        for(int i=0; i<datos.length; i++){
            System.out.println("Ingresa un número");
            datos[i]= solicitarInt();
        }
    }

    private void mostrarDatos(){
        for(int i=0; i<datos.length; i++){
            System.out.println("["+i+"] = "+ datos[i]);
        }
    }
}
