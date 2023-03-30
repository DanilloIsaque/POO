/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication3;

/**
 *
 * @author danillo.iblima
 */
import java.util.Scanner;
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int v [] = new int [10];
      
        int cont= 0;
        int valor = 0;
        while(cont<v.length){           
            if(valor%2!=0){ 
                v[cont]=valor;
            
                cont++;
            }
           valor++;
            
        }
        for(int ve : v){
            System.out.println(ve);
        }
    }
    
}
