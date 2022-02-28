import java.io.IOException;
import java.util.Scanner;

import Taller_Arreglos.EjercicioA1;
import Taller_Arreglos.EjercicioA2;
import Taller_Arreglos.EjercicioA3;
import Taller_Arreglos.EjercicioA4;
import Taller_Arreglos.EjercicioA5;
import Taller_Ciclos.EjercicioCiclo1;
import Taller_Ciclos.EjercicioCiclo2;
import Taller_Ciclos.EjercicioCiclo3;
import Taller_Ciclos.EjercicioCiclo4;
import Taller_Ciclos.EjercicioCiclo5;
import Taller_Ciclos.EjercicioCiclo6;
import Taller_Ciclos.EjercicioCiclo7;
import Taller_Ciclos.EjercicioCiclo8;
import Taller_Condicionales.EjercicioC1;
import Taller_Condicionales.EjercicioC10;
import Taller_Condicionales.EjercicioC2;
import Taller_Condicionales.EjercicioC3;
import Taller_Condicionales.EjercicioC4;
import Taller_Condicionales.EjercicioC5;
import Taller_Condicionales.EjercicioC6;
import Taller_Condicionales.EjercicioC7;
import Taller_Condicionales.EjercicioC8;
import Taller_Condicionales.EjercicioC9;
import Taller_Variables.Ejercicio1;
import Taller_Variables.Ejercicio2;
import Taller_Variables.Ejercicio3;
import Taller_Variables.Ejercicio4;
import Taller_Variables.Ejercicio5;

public class App {
    private static boolean bandera, banderaE,banderaC,banderaCiclos,banderaA = true;
    private static int opcion,opcionE, opcionC,opcionCiclos, opcionA;
    public static void main(String[] args) throws Exception {
        do{
            limpiarPantalla();
            menu();
            opcion = capturarOpcion();
            bandera = evaluarOpcion(opcion);        
        }while(bandera==true);
    }
    
    
    private static void menu(){
        System.out.println("Elige el taller");
        System.out.println("1. Taller de variables");
        System.out.println("2. Taller de condicionales");
        System.out.println("3. Taller de ciclos");
        System.out.println("4. Taller de arreglos");
        System.out.println("5. Salir del taller");
    }

    private static int capturarOpcion(){
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }
    
    private static void menu2(int n){
        System.out.println("Elige el ejercicio");
        int op=0;
        for (int i=0; i<n; i++){
            op =op+1;
            System.out.println(op+". Ejercicio "+ op);
        }
        int o1=op+1;
        System.out.println(o1+". Salir del taller");
    }

    private static boolean evaluarOpcion(int opcion) throws IOException{
        switch(opcion){
            case 1:
                do{
                    menu2(5);
                    opcionE=capturarOpcion();
                    banderaE=evaluarOpcionE(opcionE);
                }while(banderaE==true);              
                return true;
            case 2:
                do{
                    menu2(10);
                    opcionC=capturarOpcion();
                    banderaC=evaluarOpcionC(opcionC);
                }while(banderaC==true);
                return true;
            case 3:
                 do{
                    menu2(8);
                    opcionCiclos=capturarOpcion();
                    banderaCiclos=evaluarOpcionCiclos(opcionCiclos);
                }while(banderaCiclos==true);
                return true;
            case 4:
                do{
                    menu2(5);
                    opcionA=capturarOpcion();
                    banderaA=evaluarOpcionA(opcionA);
                }while(banderaA==true);
                
            case 5:
                return false;
            default:
                System.out.println("Opción incorreta");
                System.in.read();
        }
        return true;
    }

    private static void limpiarPantalla(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    
    private static boolean evaluarOpcionE(int opcionE) throws IOException{
        switch(opcionE){

            case 1:
                Ejercicio1 p1 = new Ejercicio1();
                p1.Ejercicio1();
                return true;
            case 2:
                Ejercicio2 p2 = new Ejercicio2();
                p2.Ejercicio2();
                return true;
            case 3:
                Ejercicio3 p3 = new Ejercicio3();
                p3.Ejercicio3();
                return true;
            case 4:
                Ejercicio4 p4 = new Ejercicio4();
                p4.Ejercicio4();
                return true;
            case 5:
                Ejercicio5 p5 = new Ejercicio5();
                p5.Ejercicio5();
                return true;
            case 6:
                return false;
            default:
                System.out.println("Opción incorreta");
                System.in.read();

        }
        return true;
    }
    private static boolean evaluarOpcionC(int opcionC) throws IOException{
        switch(opcionC){
            case 1:
                EjercicioC1 c1 = new EjercicioC1();
                c1.EjercicioC1();
                return true;
            case 2:
                EjercicioC2 c2 = new EjercicioC2();
                c2.EjercicioC2();
                return true;
            case 3:
                EjercicioC3 c3 = new EjercicioC3();
                c3.EjercicioC3();
                return true;
            case 4:
                
                EjercicioC4 c4 = new EjercicioC4();
                c4.EjercicioC4();
                return true;
            case 5:
                EjercicioC5 c5 = new EjercicioC5();
                c5.EjercicioC5();
                return true;
            case 6:
                EjercicioC6 c6 = new EjercicioC6();
                c6.EjercicioC6();
                return true;
            case 7:
                EjercicioC7 c7 = new EjercicioC7();
                c7.EjercicioC7();
                return true;
            case 8:
                EjercicioC8 c8 = new EjercicioC8();
                c8.EjercicioC8();
                return true;
            case 9:
                EjercicioC9 c9 = new EjercicioC9();
                c9.EjercicioC9();
                return true;
            case 10:
                EjercicioC10 c10 = new EjercicioC10();
                c10.EjercicioC10();
                return true;
            case 11:
                return false;
            default:
                System.out.println("Opción incorreta");
                System.in.read();
        }
        return true;
    }

    private static boolean evaluar(int opcionE) throws IOException{
        switch(opcionE){

            case 1:
                Ejercicio1 p1 = new Ejercicio1();
                p1.Ejercicio1();
                return true;
            case 2:
                Ejercicio2 p2 = new Ejercicio2();
                p2.Ejercicio2();
                return true;
            case 3:
                Ejercicio3 p3 = new Ejercicio3();
                p3.Ejercicio3();
                return true;
            case 4:
                Ejercicio4 p4 = new Ejercicio4();
                p4.Ejercicio4();
                return true;
            case 5:
                Ejercicio5 p5 = new Ejercicio5();
                p5.Ejercicio5();
                return true;
            case 6:
                return false;
            default:
                System.out.println("Opción incorreta");
                System.in.read();

        }
        return true;
    }
    private static boolean evaluarOpcionCiclos(int opcionCiclos) throws IOException{
        switch(opcionCiclos){
            case 1:
                EjercicioCiclo1 ciclo1 = new EjercicioCiclo1();
                ciclo1.EjercicioCiclo1();
                return true;
            case 2:
                EjercicioCiclo2 ciclo2 = new EjercicioCiclo2();
                ciclo2.EjercicioCiclo2();
                return true;
            case 3:
                EjercicioCiclo3 ciclo3 = new EjercicioCiclo3();
                ciclo3.EjercicioCiclo3();
                return true;
            case 4:
                
                EjercicioCiclo4 ciclo4 = new EjercicioCiclo4();
                ciclo4.EjercicioCiclo4();
                return true;
            case 5:
                EjercicioCiclo5 ciclo5 = new EjercicioCiclo5();
                ciclo5.EjercicioCiclo5();
                return true;
            case 6:
                EjercicioCiclo6 ciclo6 = new EjercicioCiclo6();
                ciclo6.EjercicioCiclo6();
                return true;
            case 7:
                EjercicioCiclo7 ciclo7 = new EjercicioCiclo7();
                ciclo7.EjercicioCiclo7();
                return true;
            case 8:
                EjercicioCiclo8 ciclo8 = new EjercicioCiclo8();
                ciclo8.EjercicioCiclo8();
                return true;
            case 9:
                return false;
            default:
                System.out.println("Opción incorreta");
                System.in.read();
        }
        return true;
    }
    private static boolean evaluarOpcionA(int opcionA) throws IOException{
        switch(opcionA){

            case 1:
                EjercicioA1 A1 = new EjercicioA1();
                A1.EjercicioA1();
                return true;
            case 2:
                EjercicioA2 A2 = new EjercicioA2();
                A2.EjercicioA2();
                return true;
            case 3:
                EjercicioA3 A3 = new EjercicioA3();
                A3.EjercicioA3();
                return true;
            case 4:
                EjercicioA4 A4 = new EjercicioA4();
                A4.EjercicioA4();
                return true;
            case 5:
                EjercicioA5 A5 = new EjercicioA5();
                A5.EjercicioA5();
                return true;
            case 6:
                return false;
            default:
                System.out.println("Opción incorreta");
                System.in.read();

        }
        return true;
    }
}
