package Taller_Arreglos;

public class EjercicioA3 {
    private int cont1=0, c1=0;
    public void EjercicioA3(){
        System.out.println("Números primos de 1 a 1000");
        numerosPrimos();
    }
  
    private void numerosPrimos(){
        
        for (int i=1; i<=1000; i++){
            cont1=0;
            for (int j=1; j<=i; j++){
                if (i%j==0){
                    cont1=cont1+1;             
                }else{}
            }
            
            if (cont1==2){
                System.out.println(i);
                c1=c1+1;
            }else{}
            
        }
        System.out.println("De 1 a 1000 se tienen "+ c1+" números primos");
    }
    
}
