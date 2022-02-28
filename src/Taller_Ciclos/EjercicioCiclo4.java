package Taller_Ciclos;

import java.util.Scanner;

public class EjercicioCiclo4 {
    private int numero, resultado;
    public void EjercicioCiclo4(){
        tablas();
    }
    
    private int solicitarInt(){
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }

    private void tablas(){
        System.out.println("Ingrese el número de la tabal que desea estudiar");
        numero = solicitarInt();
        for(int i=1; i<11; i++){
            resultado = i*numero;
            System.out.println(i+"X" +numero+ " = " +resultado);
        }
    }
}
