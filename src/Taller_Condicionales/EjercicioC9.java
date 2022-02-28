package Taller_Condicionales;

import java.io.IOException;
import java.util.Scanner;

public class EjercicioC9 {
    private boolean bandera = true;
    private int opcion;
    private float ancho,alto,ancho1,area;
    private Scanner input;
    public void EjercicioC9() throws IOException{
        input = new Scanner(System.in);
        do{
            menu();
            bandera=evaluarFigura(opcion);
        }while(bandera==true);

    }
    
    private void menu(){
        System.out.println("Calcular áreas");
        System.out.println("1.Calcular área de un réctangulo");
        System.out.println("2.Calcular área de un tríangulo");
        System.out.println("3.Calcular área de un trapecio");
        System.out.println("4.Salir");
        opcion=solicitarInt();
    }
    public int solicitarInt(){
        return Integer.parseInt(input.nextLine());
    }
    

    private void areaRectangulo(){
        System.out.println("Digite el ancho del rectángulo en cm");
        ancho = solicitarInt();
        System.out.println("Digite el alto del rectángulo en cm");
        alto = solicitarInt();
        area = ancho*alto;
        System.out.println("El área del triángulo es "+ area + "cm^2");
    }
    private void areaTriangulo(){
        System.out.println("Digite la base del triángulo en cm");
        ancho = solicitarInt();
        System.out.println("Digite el alto del triángulo en cm");
        alto = solicitarInt();
        area = (ancho*alto)/2;
        System.out.println("El área del triángulo es "+ area + "cm^2");
    }
    private void areaTrapecio(){
        System.out.println("Digite la base menor del trapecio en cm");
        ancho = solicitarInt();
        System.out.println("Digite la base mayor del trapecio en cm");
        ancho1 = solicitarInt();
        System.out.println("Digite la altura del trapecio en cm");
        alto = solicitarInt();
        area = alto*(ancho+ancho1)/2;
        System.out.println("El área del trapecio es "+ area + "cm^2");
    }

    private boolean evaluarFigura(int opcion) throws IOException{
        switch(opcion){
            case 1:
                areaRectangulo();
                return true;
            case 2:
                areaTriangulo();
                return true;
            case 3:
                areaTrapecio();
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
