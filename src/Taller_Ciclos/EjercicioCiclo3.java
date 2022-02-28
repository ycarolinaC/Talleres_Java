package Taller_Ciclos;

public class EjercicioCiclo3 {
    private String c,e,e1,t;
    private int n1,n2, contador,contador1,contador2;
    public void EjercicioCiclo3(){
        
        n1=10; n2 =8;
        contador=1;
        c="*";
        dibujar1();
        c="***";
        dibujar2();
        c="*****";
        dibujar3();
        
    }

    private void dibujar1(){
        
        do{
            e="";
            for (int i=0; i<n1;i++){
                e=e+" ";
            }
            t = e+ c;
            System.out.println(t);
            c=c+"**";
            contador=contador+1;
            n1=n1-1;
        }while(contador!=12);
       
    }
    private void dibujar2(){
        
        do{
            e="";
            for(int i=0; i<9; i++){
                e=e + " ";
            }
            t =e + c;
            System.out.println(t);
            contador1= contador1+1;
        }while(contador1!=2);
    }
    private void dibujar3(){
        
        do{
            e="";
            for(int i=0; i<n2; i++){
                e=e + " ";
            }
            t =e + c;
            System.out.println(t);
            c=c+"**";
            contador2= contador2+1;
            n2=n2-1;
   
    }while(contador2!=2);
   }
    
}
