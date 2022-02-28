package Taller_Condicionales;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class EjercicioC4 {
    private boolean bandera, banderaC,banderaA=true;
    private int opcion, opcionC;
    private ArrayList<String> dato = new ArrayList<>();;
    private Scanner input;
    private ArrayList<String> peliculasAlquiladas = new ArrayList<>();
    private ArrayList<String> nombrePersonas = new ArrayList<>();
    private ArrayList<String> pelis = new ArrayList<>();
    
    public void EjercicioC4() throws IOException{
        input = new Scanner(System.in);
        pelis.add("Star wars"); dato.add("0");
        pelis.add("Encanto"); dato.add("0");
        pelis.add("Harry potter"); dato.add("0");
        pelis.add("Zoo");dato.add("0");
        pelis.add("Alerta roja");dato.add("0");
        pelis.add("Rapido y furioso");dato.add("0");
        do{
            menu();
            opcion=solicitarOpcion();
            bandera=evaluarOpcion(opcion);
        }while(bandera==true);

    }

    public void peliculas(){
        
        for (int i = 0; i < pelis.size();i++) 
	      { 		      
	          System.out.println(pelis.get(i)); 		
	      }
        //System.out.println(pelis);          
    }
    public void menu(){
        System.out.println("Tienda de video El Porvenir");
        System.out.println("Elige una opción");
        System.out.println("1.Consultar películas");
        System.out.println("2.Alquilar películas");
        System.out.println("3.Recibir películas");
        System.out.println("4.Salir");
    }

    public int solicitarOpcion(){      
        return Integer.parseInt(input.nextLine());
    }
    public String solicitarString(){      
        return input.nextLine();
    }

    private boolean evaluarConsulta(int opcionC) throws IOException{
        switch(opcionC){
            case 1:
                return false;
            default:
                System.out.println("Opción incorrecta");
                System.in.read();
        }
        return true;

    }
    
    private void peliculasC(){
        System.out.println("Películas disponibles");
        peliculas();
        System.out.println("1.Regresar al menú principal"); 
        opcionC = solicitarOpcion(); 

    }

    private void alquilarPeliculas(){

        do{
            System.out.println("Alquilar películas");
            peliculas();
            String nombrePelicula, nombreCliente;
            System.out.println("Ingrese el nombre de la película que desea alquilar");
            nombrePelicula = solicitarString();
        System.out.println("Confirmar: Alquilar "+ nombrePelicula + " Si o No");
        String respuesta = solicitarString();
        if (respuesta.equals("Si")){
            System.out.println("Ingrese el nombre de la persona que va a alquilar la película");
            nombreCliente = solicitarString();
            System.out.println(nombrePelicula+ " alquilada a "+nombreCliente);
            peliculasAlquiladas.add(nombrePelicula);
            nombrePersonas.add(nombreCliente);
            banderaA=false;
        }else{
            System.out.println("Regresar al menú principal");
            banderaA=false;
        }

        }while(banderaA==true);    

    }

    private void recibirPelicula(){
        if(peliculasAlquiladas.size()==0){
            System.out.println("No se han alquilado películas hasta el momento");
        }else{
            for(int i =0; i<peliculasAlquiladas.size(); i++){
                System.out.println(peliculasAlquiladas.get(i));
            }
            System.out.println("¿Qué película va a regresar?");
            String nombreP= solicitarString();
            int posicion=-1;
            for(int i =0; i<peliculasAlquiladas.size(); i++){
                if(nombreP.equals(peliculasAlquiladas.get(i))){
                    posicion=i;
                }
            }    
            if (posicion==-1){
                System.out.println("El nombre de la película no coincide");
            }    
            else{
                 System.out.println("Recibir película "+ peliculasAlquiladas.get(posicion)+" entregada por "+ nombrePersonas.get(posicion));  
                 System.out.println("Desea registrar observaciones Si o No");
                 String r1 = solicitarString();
                 if (r1.equals("Si")){
                     String observaciones;
                     System.out.println("Ingrese las observaciones");
                     observaciones=solicitarString();
                 } 
                 else {
                     System.out.println("No hay observaciones");
                 }
                }
        }
    }

    private boolean evaluarOpcion(int opcion) throws IOException{
        switch(opcion){
            case 1:
                do{
                    peliculasC();
                    banderaC = evaluarConsulta(opcionC);
                }while(banderaC==true);
                return true;
            case 2:
                alquilarPeliculas();
                return true;
            case 3:
                recibirPelicula();
                return true;
            case 4:
                return false;
            default: 
                System.out.println("Opción correcta");
                System.in.read();
            
        }
        return true;

    }

}
