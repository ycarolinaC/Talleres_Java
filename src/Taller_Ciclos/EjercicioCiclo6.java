package Taller_Ciclos;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class EjercicioCiclo6 {
    private boolean bandera = true;
    private int opcion,telefono, p1,p2,p3;
    private Scanner input;
    private String nombre;
    private ArrayList<String> nombreP = new ArrayList<>();
    private ArrayList<Integer> telefonos = new ArrayList<>();
    public void EjercicioCiclo6() throws IOException{
        input = new Scanner(System.in);
        do{
            menu();
            bandera=evaluar(opcion);
        }while(bandera==true);
        
    }
    private void menu(){
        System.out.println("Menú usuario");
        System.out.println("Elige una opción");
        System.out.println("1.Agregar contactos");
        System.out.println("2.Buscar contactos");
        System.out.println("3.Eliminar contactos");
        System.out.println("4.Salir");
        opcion= solicitarInt();

    }
    private int solicitarInt(){   
        return Integer.parseInt(input.nextLine());
    }
    private String solicitarString(){   
        return input.nextLine();
    }
    private void agregarContacto(){
        if (nombreP.size()<=3){
            System.out.println("Crear contacto");
            System.out.println("Nombre:");
            nombre=solicitarString();
            System.out.println("Teléfono:");
            telefono=solicitarInt();
            for (int i=0; i< nombreP.size();i++){
                if(telefonos.get(i).equals(telefono)){
                    p1=10;
                }else{p1=-1;}
            }
            if(p1==-1){
                nombreP.add(nombre);      
                telefonos.add(telefono);
            }else{
                System.out.println("El número teléfonico ya está guardado:");
            }
        }else{
            System.out.println("Libreta de contactos llena.");
        }
        
    }

    private void buscarContacto(){
        
        if (nombreP.size()>0){
            System.out.println("El número teléfonico que desea buscar");
            telefono = solicitarInt();
            for (int i=0; i< nombreP.size();i++){
                if(telefonos.get(i).equals(telefono)){
                    p2=i;
                }else{p2=-1;}
            }
            if(p2!=-1){
                System.out.println("El número teléfonico pertenece a "+ nombreP.get(p2));
            }else{
                System.out.println("El número teléfonico no está guardado");
            }

        }else{
            System.out.println("No tiene números guardados");
        }
    }

    private void borrarContacto(){
        if (nombreP.size()>0){
            System.out.println("El número teléfonico que desea eliminar");
            telefono = solicitarInt();
            for (int i=0; i< nombreP.size();i++){
                if(telefonos.get(i).equals(telefono)){
                    p3=i;
                }else{p3=-1;}
            }
            if(p3!=-1){
                nombreP.remove(p3); telefonos.remove(p3);
                System.out.println("Número eliminado");
            }else{
                System.out.println("El número teléfonico no está guardado");
            }

        }else{
            System.out.println("No tiene números guardados");
        }
    }
    private boolean evaluar(int opcion) throws IOException{
        switch(opcion){
            case 1:
                agregarContacto();              
                return true;
            case 2:
                buscarContacto();
                return true;
            case 3:
                borrarContacto();
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
