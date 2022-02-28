package Taller_Arreglos;

public class EjercicioA4 {
    private int  matriz [][] = new int[4][5];
    private int  n1 [][] = new int[4][5];
    private int numero=1, np;
    public void EjercicioA4(){
        llenarMatriz();
        reorganizar();
    }
    private void llenarMatriz(){
        for(int i =0; i<4; i++){
            for(int j=0; j<5; j++){
                matriz[i][j]=numero;
                numero = numero +1;
            System.out.print(matriz[i][j]+ " ");
            }
            System.out.println("");
        }
    }

    private void reorganizar(){   
        for(int i=0;i<4; i++){
            np=4; 
            for (int j = 0; j<5; j++){
                if(i==0 || i==2 ){
                    n1[i][j]=matriz[i][j];
                    System.out.print(n1[i][j]+" ");
                }else{
                    n1[i][j]=matriz[i][np];
                    np=np-1;
                    System.out.print(n1[i][j]+" ");
                }
            }  
            System.out.println("");     
        }
    }
    
}
