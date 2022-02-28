package Taller_Condicionales;

import java.io.IOException;
import java.util.Scanner;

public class EjercicioC10 {
    private String usuario;
    private boolean bandera=true;
    private int opcion;
    private float saldo, ingreso, retiro; 
    private Scanner input;
    public void EjercicioC10() throws IOException{
        input= new Scanner(System.in);
        saldo = 10000;
        usuario="Carolina";
        do{
            menu();
            bandera=evaluarOperacion(opcion);
        }while(bandera==true);

    }
    private void menu(){
        System.out.println("Banco Amigo");
        System.out.println("Elige la operación que dese realizar");
        System.out.println("1.Depositar");
        System.out.println("2.Retirar");
        System.out.println("3.Consultar");
        System.out.println("4.Salir");
        opcion=solicitarInt();
    }
    public int solicitarInt(){
        return Integer.parseInt(input.nextLine());
    }
    public float solicitarF(){
        return Float.parseFloat(input.nextLine());
    }

    private void depositar(){
        System.out.println("Valor a ingresar");
        ingreso =solicitarF();
        saldo= saldo+ingreso;
        System.out.println("Deposito exitoso");
    }

    private void retirar(){
        System.out.println("Valor a retirar");
        retiro =solicitarF();
        if (retiro<saldo){
            saldo= saldo-retiro;
            System.out.println("Retiro exitoso");
        }else{ 
            System.out.println("Fondos insuficientes");
        }
         
    }
    private void consultar(){
        System.out.println("Saldo $"+ saldo);
    }

    private boolean evaluarOperacion(int opcion) throws IOException{
        switch(opcion){
            case 1:
                depositar();
                return true;
            case 2:
                retirar();
                return true;
            case 3:
                consultar();
                return true;
            case 4:
                return false;
            default:
                System.out.println("Opción inválida");
                System.in.read();
        }
        return true;
    }
}
