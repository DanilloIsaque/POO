/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funcao;
import java.util.Scanner;
/**
 *
 * @author danillo.iblima
 */
public class Funcao {

    /**
     * @param args the command line arguments
     */
    static void somar(int n1, int n2){
        int resultado;
        resultado = n1+n2;
        
        System.out.println("a soma é " + resultado);
    }
    
    static void exibirAsterisco(){
        for(int x=0;x<=49;x++)
       System.out.print("*");
    }
   
    static void exibirMes(int n1){
        switch(n1){
            case 1 :
                System.out.println("Janeiro");
             break;
              case 2 :
                System.out.println("Fevereiro");
             break;
              case 3 :
                System.out.println("Março");
             break;
              case 4 :
                System.out.println("Abril");
             break;
              case 5 :
                System.out.println("Maio");
             break;
              case 6 :
                System.out.println("Junho");
             break;
              case 7 :
                System.out.println("Julho");
             break;
              case 8 :
                System.out.println("Agosto");
             break;
              case 9 :
                System.out.println("Setembro");
             break;
              case 10 :
                System.out.println("Outubro");
             break;
              case 11 :
                System.out.println("Novembro");
             break;
              case 12 :
                System.out.println("Dezembro");
             break;
             
              default:
                  System.out.println("o numero escolhido não corresponde ao seu respectivo mês. Tente novamente um número entre 0 e 12");
        }
    }
    
   
    
    public static void main(String[] args) {
       
        // TODO code application logic here
          System.out.println("esse é meu primeiro método em Java");
          exibirAsterisco();
          System.out.println("fiz uma chamada do metodo exibirAstersco()");
          exibirAsterisco();
          System.out.println("fiz outra chamada!");
          exibirAsterisco();
        Scanner entrada = new Scanner(System.in);
             System.out.println("digite um numero para que eu possa soma-lo : ");
      int numero = entrada.nextInt();
            System.out.println("digite outro : ");
       int numero2 = entrada.nextInt();
        somar(numero,numero2);
    
    
    
     
    System.out.println("digite um numero entre 0 e 12 equivalente ao seu respectivo mês");
      int mes = entrada.nextInt();
      exibirMes(mes);
    }
}
