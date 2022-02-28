package Taller_Ciclos;

public class EjercicioCiclo2 {
    private String c,e,t;
    private int n1, contador;
    public void EjercicioCiclo2(){
        c="*";
        n1=9;
        contador=1;
        dibujar();
    }

    private void dibujar(){
        while(contador<11){
            e="";
            for (int i = 0; i<n1; i++){
                e= e + " ";
            }
            t = e + c;
            System.out.println(t);
            c = "*"+ c;
            contador= contador+1;
            n1=n1-1;
        }

    }
    
}
