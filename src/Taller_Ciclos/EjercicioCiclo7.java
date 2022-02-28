package Taller_Ciclos;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class EjercicioCiclo7 {
    private boolean bandera = true;
    private int opcion,telefono;
    private Scanner input;
    private String nombre,placa, marca;
    private ArrayList<String> nombreP = new ArrayList<>();
    private ArrayList<String> placas = new ArrayList<>();
    private ArrayList<String> estado = new ArrayList<>();
    private ArrayList<String> marcas = new ArrayList<>();
    private ArrayList<Integer> telefonos = new ArrayList<>();
    public void EjercicioCiclo7() throws IOException{
        input = new Scanner(System.in); 
        do{
            menu();
            bandera=evaluar(opcion);
        }while(bandera==true);
    }

    private void menu(){
        System.out.println("Parqueadero \"El Guardian\"");
        System.out.println("Elige una opción");
        System.out.println("1.Ingresar al parquadero");
        System.out.println("2.Consultar parquadero");
        System.out.println("3.Retirar del parqueadero");
        System.out.println("4.Salir");
        opcion= solicitarInt();

    }

    
    private int solicitarInt(){   
        return Integer.parseInt(input.nextLine());
    }
    private String solicitarString(){   
        return input.nextLine();
    }
    private void ingresar(){
        if (nombreP.size()<=5){
            System.out.println("Nombre completo de la persona que ingresa el vehículo");
            nombre=solicitarString(); nombreP.add(nombre);
            System.out.println("Ingresar el teléfono");
            telefono= solicitarInt(); telefonos.add(telefono);
            System.out.println("Ingresa la placa");
            placa=solicitarString(); placas.add(placa);
            System.out.println("Ingresa la marca");
            marca=solicitarString(); marcas.add(marca);
            estado.add("Ingresado");         				
        }else{
            System.out.println("Parqueadero sin cupo");
        }

    }
    private void consultar(){
        
        if (nombreP.size()>0){
            int pos=-1;
            System.out.println("Ingresa la placa de vehículo que desa consultar");
            placa=solicitarString();
            for (int i=0; i< nombreP.size();i++){
                if(placas.get(i).equals(placa)){
                    pos=i;
                }
            }
            if(pos!=-1){
                System.out.println("Vehículo pertenece a: "+ nombreP.get(pos));
                System.out.println("Teléfono: "+ telefonos.get(pos));
                System.out.println("Marca: "+ marcas.get(pos));
                System.out.println("Estado: "+ estado.get(pos));
            }else{
                System.out.println("No se encontró coincidencia");
            }
        }else{
            System.out.println("No han ingresado vehículos");
        }
    }
    private void retirar(){
        if (nombreP.size()>0){

            int pos=-1;
            System.out.println("Ingresa la placa de vehículo que desa retirar");
            placa=solicitarString();
            for (int i=0; i< nombreP.size();i++){
                if(placas.get(i).equals(placa)){
                    pos=i;
                }
            }
            if(pos!=-1){
                System.out.println("Vehículo pertenece a: "+ nombreP.get(pos));
                System.out.println("Teléfono: "+ telefonos.get(pos));
                System.out.println("Marca: "+ marcas.get(pos));
                System.out.println("Estado: "+ estado.set(pos,"Retirar"));
                nombreP.remove(pos); placas.remove(pos);
                marcas.remove(pos); estado.remove(pos);
            }else{
                System.out.println("No se encontró coincidencia");
            }
        }else{
            System.out.println("No han ingresado vehículos");
        }
    }
    private boolean evaluar(int opcion) throws IOException{
        switch(opcion){
            case 1:
                ingresar();              
                return true;
            case 2:
                consultar();
                return true;
            case 3:
                retirar();
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
