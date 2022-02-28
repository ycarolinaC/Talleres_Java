package Taller_Arreglos;

import java.util.Scanner;

public class EjercicioA5 {
    private String  matriz [][] = new String[10][10];
    private int  matrizT [][] = new int[10][10];
    private int n1,n2;
    public void EjercicioA5(){
        tablas();
        datos();
    }
    private void tablas(){
        System.out.println("Tablas de multiplicar");
        for(int i=0; i<10; i++){
            for(int j=0; j<10; j++){
                matriz[i][j] = String.valueOf(j+1)+"X"+ String.valueOf(i+1);
                matrizT[i][j] = (j+1)*(i+1);
                System.out.print(matriz[i][j]+ " ");
            }
            System.out.println("");
        }
    }

    public int solicitarInt(){
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }
    private void datos(){
        System.out.println("Ingrese factor 1");
        n1=solicitarInt();
        System.out.println("Ingrese factor 2");
        n2=solicitarInt();
        System.out.println(n1+"X"+n2+" = "+matrizT[n2-1][n1-1]);
    }
}
