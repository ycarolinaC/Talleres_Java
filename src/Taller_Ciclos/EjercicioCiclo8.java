package Taller_Ciclos;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;

public class EjercicioCiclo8 {
    private Scanner input;
    private boolean bandera = true;
    private int opcion,cedula,p1,p2;
    private String nombre,e1, prueba;
    private ArrayList<String> nombreP = new ArrayList<>();
    private ArrayList<Integer> cedulas = new ArrayList<>();
    private ArrayList<String> examenesM = new ArrayList<>();
    private ArrayList<String> pruebas = new ArrayList<>();
    public void EjercicioCiclo8() throws IOException{
        input = new Scanner(System.in);
        do{
            menu();
            bandera=evaluar(opcion);
        }while(bandera==true);


    }

    private void menu(){
        System.out.println("Escuela automovilísitca \"El Maestro\"");
        System.out.println("Elige una opción");
        System.out.println("1.Ingresar al curso");
        System.out.println("2.Ingresar avances del curso");
        System.out.println("3.Consultar usuarios");
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
        if (nombreP.size()<=8){
            System.out.println("Nombre completo ");
            nombre=solicitarString(); nombreP.add(nombre);
            System.out.println("Ingresarla cédula");
            cedula= solicitarInt(); cedulas.add(cedula);
            System.out.println("Inscrito"); examenesM.add("R");pruebas.add("R");
        }else{
            System.out.println("No hay cupo");
        }
        

    }
    private void consultar(){
        if (nombreP.size()>0){
            p2=-1;
            System.out.println("Ingresar cédula");
            cedula = solicitarInt();
            for (int i=0; i< nombreP.size();i++){
                if(cedulas.get(i).equals(cedula)){
                    p2=i;
                }
            }
            if(p2!=-1){
                if (examenesM.get(p2).equals("Si") && pruebas.get(p2).equals("Si")){
                    System.out.println("El usuario " + nombreP.get(p2)+ " ha cumplido con todos los requisitos");
                }  else{
                    System.out.println("No ha completado los requisitos");
                    System.out.println("Exámenes médicos: "+ examenesM.get(p2));
                    System.out.println("Pruebas: "+ pruebas.get(p2));
                }          

            }else{
                System.out.println("El usuario no está registrado");
            }

        }else{
            System.out.println("No hay personas registradas");
        }
    }
    private void avances(){
        if (nombreP.size()>0){
            p1=-1;
            System.out.println("Ingresar cédula");
            cedula = solicitarInt();
            for (int i=0; i< nombreP.size();i++){
                if(cedulas.get(i).equals(cedula)){
                    p1=i;
                }
            }
            if(p1!=-1){
                System.out.println("El usuario " + nombreP.get(p1));
                System.out.println("Se realizo los exámenes médicos Si o No");
                e1=solicitarString(); examenesM.set(p1,e1);
                System.out.println("Realizó la prueba Si o No");
                prueba=solicitarString(); pruebas.set(p1,prueba);

            }else{
                System.out.println("El usuario no está registrado");
            }

        }else{
            System.out.println("No hay personas registradas");
        }
    }
    private boolean evaluar(int opcion) throws IOException{
        switch(opcion){
            case 1:
                ingresar();              
                return true;
            case 2:
                avances();
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
