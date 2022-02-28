package Taller_Ciclos;

import java.io.IOException;
import java.util.Scanner;

public class EjercicioCiclo5 {
    private boolean bandera = true;
    private int opcion;
    private Scanner input;
    private String nombre;
    public void EjercicioCiclo5() throws IOException{
        input = new Scanner(System.in);
        nombre="";
        do{
            menu();
            bandera=evaluar(opcion);
        }while(bandera==true);
        
    }
    
    private void menu(){
        System.out.println("Menú usuario");
        System.out.println("Elige una opción");
        System.out.println("1.Capturar nombre");
        System.out.println("2.Saludar persona");
        System.out.println("3.Salir");
        opcion= solicitarInt();

    }
    private int solicitarInt(){   
        return Integer.parseInt(input.nextLine());
    }
    private String solicitarString(){   
        return input.nextLine();
    }

    private boolean evaluar(int opcion) throws IOException{
        switch(opcion){
            case 1:
                System.out.println("Digite su nombre");
                nombre = solicitarString();
                return true;
            case 2:
                System.out.println("Hola " + nombre);
                return true;
            case 3:
                return false;
            default:
                 System.out.println("Opción inválida");
                 System.in.read();

        }
        return true;
    }
}
