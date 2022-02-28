package Taller_Ciclos;

public class EjercicioCiclo1 {
    private String c;
    public void EjercicioCiclo1(){
        c="*";
        dibujar();

    }

    private void dibujar(){
        for (int i=0; i<10;i++){
            System.out.println(c);
            c= c + "*";
        } 

    }
}
