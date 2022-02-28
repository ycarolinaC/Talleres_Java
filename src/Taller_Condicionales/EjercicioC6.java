package Taller_Condicionales;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class EjercicioC6 {
    public Scanner input;
    private boolean bandera=true;
    private  int opcion,p1;
    private ArrayList<String> placas= new ArrayList<>();
    private ArrayList<String> nombresP= new ArrayList<>();
    private ArrayList<String> observacionesI= new ArrayList<>();
    private ArrayList<String> observacionesS= new ArrayList<>();
    private String placa, nombre, observacionI, observacionS, arreglos;
    public void EjercicioC6() throws IOException{
        input = new Scanner(System.in);
        do{
            menu();
            bandera = evaluarOpcion(opcion);
        }while(bandera==true);
    }
    
    private void menu(){
        System.out.println("Taller de motos \"El Maquinista\"");
        System.out.println("Elige una opción");
        System.out.println("1.Resgistro de ingreso");
        System.out.println("2.Registro del mecánico");
        System.out.println("3.Registro de salida");
        System.out.println("4.Salir");
        opcion = solicitarInt(); 
    }

    private boolean evaluarOpcion(int opcion) throws IOException{
        switch(opcion){
            case 1:
                System.out.println("Ingresa la placa");
                placa = solicitarString(); placas.add(placa);
                System.out.println("Nombre del propietario");
                nombre = solicitarString(); nombresP.add(nombre);
                System.out.println("Observaciones de ingreso");
                observacionI=solicitarString(); observacionesI.add(observacionI);
                System.out.println("Registro terminado");
                observacionesS.add("R");
                return true;
            case 2:
                
                if(placas.size()>0){
                    p1=-1;
                    System.out.println("Ingresa la placa");
                    placa = solicitarString(); 
                    for (int i=0; i<placas.size();i++){
                        if(placas.get(i).equals(placa)){
                            p1 = i;      
                        }else{
                            p1=-1;
                        }         
                    }
                    if(p1!=-1){
                        System.out.println("Razones de revisión");
                        System.out.println(observacionesI.get(p1));
                        System.out.println("Revisión y arreglos");
                        arreglos = solicitarString();
                        observacionesS.set(p1, arreglos);
                    }
                }else{
                    System.out.println("No hay motos ingresadas");
                }
                return true;
            case 3:
                
                if(placas.size()> 0){
                    System.out.println("Ingresa la placa");
                    placa = solicitarString();
                    for (int i=0; i<placas.size();i++){
                        if(placas.get(i).equals(placa)){
                            System.out.println("La moto con placa : " + placas.get(i));
                            System.out.println("La entrega se hace con las siguientes observaciones: "+ observacionesS.get(i));
                        }
                    }
                }else{
                    System.out.println("La moto no ha sido ingresada");
                }
                return true;
            case 4:

                return false;
            default:
                System.out.println("Opción inválida");
                System.in.read();
        }
        return true;
    }

    public int solicitarInt(){
        return Integer.parseInt(input.nextLine());
    }
    public String solicitarString(){
        return input.nextLine();
    }
}
