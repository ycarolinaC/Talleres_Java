package Taller_Condicionales;
import java.io.IOException;
import java.util.Scanner;

public class EjercicioC7 {
    private Scanner input;
    private float peso, altura, IMC;
    public void EjercicioC7() throws IOException{
        input= new Scanner(System.in);
        solicitarAltura();
        solicitarPeso();
        IMC = peso/(altura*altura);
        compararIMC(IMC);

    }

    private void solicitarPeso(){
        System.out.println("Digite su peso en Kilogramos(Kg)");
        peso=solicitarF();
       
    }
    private void solicitarAltura(){
        System.out.println("Digite su altura en metros(m)");
        altura=solicitarF();    
    }

    public float solicitarF(){
        return input.nextFloat();
    }
    public int solicitarI(){
        return Integer.parseInt(input.nextLine());
    }

    public void compararIMC(float IMC){
        if (IMC<18.5){
            System.out.println("Bajo peso");
        }else{
            if (IMC>=18.5 && IMC<25){
                System.out.println("Peso Normal");
            }else{
                if (IMC>=25 && IMC<30){
                    System.out.println("Sobrepeso");
                }else{
                    System.out.println("Obeso");
                }

            }
        }
    }

}
