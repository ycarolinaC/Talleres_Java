package Taller_Arreglos;

import java.util.Random;

import javafx.stage.Modality;

public class EjercicioA2 {
    private int [] datos = new int[20];
    private Random numero = new Random();
    private int cont=0,c1=0;

    public void EjercicioA2(){
        llenarDatos();
        compararDatos();
        
    }
    private void llenarDatos(){
        for(int i=0; i<datos.length; i++){  
            datos[i]= numero.nextInt(99)+1;
        }
    }

    private void compararDatos(){
        System.out.print("Números pares: "); 
        while(cont<=19){
            if (datos[cont] % 2== 0){
                System.out.print(datos[cont]+","); 
            }
            cont = cont+1;
        }
        System.out.println(""); 
        System.out.print("Números pares: "); 
        while(c1<=19){
            if (datos[c1] % 2> 0){
                System.out.print(datos[c1]+","); 
            }
            c1 = c1+1;
        }
        System.out.println(""); 
    }
        
}
