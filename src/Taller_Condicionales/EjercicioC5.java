package Taller_Condicionales;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class EjercicioC5 {

    private boolean bandera, banderaC, banderaEC, banderaR=true;
    private int opcion, opcionC,opcionEC,opcionR;
    private Scanner input;
    private String medicina;
    private ArrayList<String> medicamentos = new ArrayList<>();
    private ArrayList<Float> precios = new ArrayList<>();
    private float factura=0;
    private int posicionC;
    public void EjercicioC5() throws IOException{
        input = new Scanner(System.in);
        inventario();
        do{
            menu();
            bandera=evaluarOpcion(opcion);
        }while(bandera==true);
    }

    private void inventario(){
        medicamentos.add("Ibuprofeno"); precios.add((float) 1800);
        medicamentos.add("Advil"); precios.add((float) 1500);
        medicamentos.add("Acetaminofen");precios.add((float) 2500);
        medicamentos.add("Noraver");precios.add((float) 2500);
        medicamentos.add("X-Raydol");precios.add((float) 1500);
        medicamentos.add("Paz noche");precios.add((float) 2000);
        medicamentos.add("Complejo B");precios.add((float) 7000);
    }
    public void menu(){
        System.out.println("Droguería mi Salud");
        System.out.println("Elige una opción");
        System.out.println("1.Consultar medicamentos");
        System.out.println("2.Comprar medicamentos");
        System.out.println("3.Devolver medicamento");
        System.out.println("4.Salir");
        opcion=solicitarInt();
    }
     
    private void consultarMedicamentos(){
        System.out.println("Medicamentos          Precios ");
        for(int i=0; i<medicamentos.size(); i++){
            System.out.println(medicamentos.get(i)+".........$"+precios.get(i));
        }
        System.out.println("Digita 1: Para regresar al menú principal");
        opcionC=solicitarInt();
        
    }
    
    public String solicitarString(){
        return input.nextLine();
    }
    public int solicitarInt(){
        return Integer.parseInt(input.nextLine());
    }

    private boolean evaluarConsulta(int opcionC) throws IOException{
        switch(opcionC){
            case 1:
                return false;
            default:
                System.out.println("Valor digitado no es válido");
                System.in.read();
        }
        return true;
    }

    private void menuComprar(){
        System.out.println("Elige una opción");
        System.out.println("1.Comprar");
        System.out.println("2.Salir");
        opcionEC= solicitarInt();
    }

    private boolean evaluarCompra(int opcionEC) throws IOException{
        switch(opcionEC){
            case 1:
                factura = buscarMedicamento();
                System.out.println("Valor parcial $" + factura);
                return true;
            case 2:
                System.out.println("Valor total de la compra: $"+factura);
                return false;
            default:
                System.out.println("Valor digitado no es válido");
                System.in.read();
        }
        return true;
    }
    private float buscarMedicamento(){
        posicionC=-1;
        System.out.println("Ingresar medicamento que va a comprar: ");
        medicina = solicitarString();
        for(int i=0; i<medicamentos.size();i++){
            if(medicina.equals(medicamentos.get(i))){
                posicionC=i;
            }
                                        
        }
        if (posicionC != -1){
            System.out.println(medicamentos.get(posicionC)+".........$"+precios.get(posicionC));
            System.out.println("¿Va a llevar el medicamento Si o No?");
            String respuesta=solicitarString();
            if (respuesta.equals("Si")){
                factura = factura+precios.get(posicionC);
            }

        }else{System.out.println("El medicamento ingresado no coincide");

        }                
        return factura;
    }

    private void menuDevolucion(){
        System.out.println("Elige una opción");
        System.out.println("1.Regresar medicamento");
        System.out.println("2.Salir");
        opcionR= solicitarInt();
    }
    private boolean evaluarDevolucion(int opcionR) throws IOException{
        switch(opcionR){
            case 1:
                posicionC=-1;
                System.out.println("Ingresar medicamento que va a regresar: ");
                medicina = solicitarString();
                for(int i=0; i<medicamentos.size();i++){
                    if(medicina.equals(medicamentos.get(i))){
                        posicionC=i;
                    }
                                                
                }
                if (posicionC != -1){
                    System.out.println(medicamentos.get(posicionC)+".........$"+precios.get(posicionC));
                    System.out.println("Confirmar devolución Si o No");
                    String respuesta=solicitarString();
                    if (respuesta.equals("Si")){
                        System.out.println("Valor a regresar $"+ precios.get(posicionC));
                    }
        
                }else{System.out.println("El medicamento ingresado no coincide");
            }
                return true;
            case 2:
                return false;
        }
        return true;
    }

    private boolean evaluarOpcion(int opcion) throws IOException{ 
        switch(opcion){
            case 1:
                do{ 
                   consultarMedicamentos();
                   banderaC=evaluarConsulta(opcionC);                        
                }while(banderaC==true);

                return true;
            case 2:
                do{
                    menuComprar();
                    banderaEC=evaluarCompra(opcionEC);
                }while(banderaEC==true);
                return true;
            case 3 :
                do{
                    menuDevolucion();
                    banderaR=evaluarDevolucion(opcionR);
                }while(banderaR==true);
                return true;
            case 4:
                return false;
            default:
                System.out.println("Opción elegida inválida");
                System.in.read();
        }
        return true;
    }
    
}
