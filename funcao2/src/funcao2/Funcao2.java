/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funcao2;
import java.util.Scanner;
/**
 *
 * @author danillo.iblima
 */
public class Funcao2 {
 static void encontrarMax(int n1, int n2){
     
     if(n1>n2){
            System.out.println(n1 + " é maior que "+n2);
        }
        else if(n2>n1){
             System.out.println(n2 + " é maior que "+n1);
        }
        else{
             System.out.println(n1 + "é igual a "+n2);
        }
  /*
        int maior;
         
        if(n1>n2){
            maior = n1;
        }
        else{
            maior = n2;
        }                              ao usar esse do retorno, tenho q mudar o void para int
        
     return maior;
     */
 }      
        
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner entrada = new Scanner(System.in);
             System.out.println("digite dois numeros:  ");
           int numero1 = entrada.nextInt();
           int numero2 = entrada.nextInt();
           
           encontrarMax(numero1,numero2);
    }
    
}
