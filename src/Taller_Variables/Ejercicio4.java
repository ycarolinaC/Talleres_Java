package Taller_Variables;

import java.util.Scanner;

public class Ejercicio4 {
    private String capital;
    private String pais;

    public void Ejercicio4(){
        solicitarCapital();
        capital = solicitarDatos();
        solicitarPais();
        pais = solicitarDatos();
        mensaje(capital, pais);
    }
    private void solicitarCapital(){
        System.out.println("Digite una ciudad capital");
    }

    private void solicitarPais(){
        System.out.println("Digite el país d ela ciudad capital que ingreso");
    }

    private String solicitarDatos(){
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }    
    
    private void mensaje(String capital, String pais){
        System.out.println("La ciudad "+capital+", es la capital de "+pais+".");
    }
}
