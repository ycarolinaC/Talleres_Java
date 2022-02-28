package Taller_Condicionales;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class EjercicioC8 {
    private Scanner input;
    private boolean bandera=true;
    private int opcion;
    private String torta,tortar;
    private int cantidadTortas, precioTorta,posicion,cantidadTortas1;
    private ArrayList<String> pasteles = new ArrayList<>();
    private ArrayList<String> pastelesVendidos = new ArrayList<>();
    private ArrayList<Integer> precios = new ArrayList<>();
    private ArrayList<Integer> preciosV = new ArrayList<>();
    private ArrayList<Integer> cantidades = new ArrayList<>();
    private ArrayList<Integer> cantidadesV = new ArrayList<>();
    public void EjercicioC8 () throws IOException{
        input = new Scanner(System.in);

        do{
            menu();
            bandera= evaluarO(opcion);
        }while(bandera==true);

    }
    private void registarTortasDisponibles(){
        System.out.println("Nombre de la torta");
        torta=solicitarString(); pasteles.add(torta);
        System.out.println("Precio de la torta");
        precioTorta=solicitarInt(); precios.add((precioTorta));
        System.out.println("Ingrese cantidades disponibles");
        cantidadTortas=solicitarInt(); cantidades.add(cantidadTortas);
    }

    private void solicitarPedido(){
        posicion=-1;
        if (pasteles.size()>0){
            System.out.println("¿Qué torta desea?");
            tortar = solicitarString();
            for(int i=0; i<pasteles.size();i++){
                if (pasteles.get(i).equals(tortar)){
                    posicion=i;
                }else{posicion=-1;}
            }
            if(posicion!=-1){
                System.out.println("¿Cuántas cantidades desea de torta de " + torta+"?");
                cantidadTortas1=solicitarInt();
                
                if (cantidades.get(posicion)>= cantidadTortas1){
                    cantidades.set(posicion,cantidades.get(posicion)- cantidadTortas1);
                    System.out.println("Pedido solicitado con éxito");
                    pastelesVendidos.add(pasteles.get(posicion));
                    preciosV.add(precios.get(posicion));
                    cantidadesV.add(cantidadTortas1);
                }else{
                    System.out.println("El número de tortas disponibles no es suficiente para el pedido");
                }
            }else{System.out.println("Torta de " + tortar + "no disponible");

            }
        }else{
            System.out.println("No hay tortas registradas");
        }
        
    }

    private void ventasDia(){
        int acumulador=0;
        if(pastelesVendidos.size()>0){
            System.out.println("Tortas vendidas          $");
            for (int i=0; i<pastelesVendidos.size(); i++){
                int valor = (cantidadesV.get(i))*preciosV.get(i);
                System.out.println(pastelesVendidos.get(i)+"       $"+ valor);
                acumulador = acumulador +valor;
            }
        System.out.println("Total ventas del días $"+ acumulador);   
        }else{
            System.out.println("Aún no se han resgistrado ventas");
        }
    }
    private void menu(){
        System.out.println("Tortas");
        System.out.println("Elige una opción");
        System.out.println("1.Registrar tortas disponibles");
        System.out.println("2.Solicitar pedido");
        System.out.println("3.Ventas del día");  
        System.out.println("4.Salir");   
        opcion = solicitarInt(); 
    }
    
    public int solicitarInt(){
        return Integer.parseInt(input.nextLine());
    }
    public String  solicitarString(){
        return input.nextLine();
    }

    private boolean evaluarO(int opcion) throws IOException{
        switch(opcion){
            case 1:
                registarTortasDisponibles();
                return true;
            case 2:
                solicitarPedido();
                return true;
            case 3:
                ventasDia();
                return true;
            case 4:
                return false;
            default:
                System.out.println("Opción no válida"); 
                System.in.read();

        }
        return true;
    }
    
}
