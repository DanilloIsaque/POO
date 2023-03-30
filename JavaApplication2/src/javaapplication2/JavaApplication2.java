/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication2;

/**
 *
 * @author danillo.iblima
 */

import java.util.Scanner;

public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // int v [] = new int [5];// vai do 0 ao 4  
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("digite o tanto de pessoas: ");
        int n = entrada.nextInt();
   int v [] = new int [n];// vai do 0 ao 4  
        int soma=0;
        for(int x=0;x<n;x++){
             System.out.println("digite a idade das pessoas:  ");
            v[x]= entrada.nextInt();
         
            soma= soma+v[x];
        }
        int media = soma/n;
        System.out.println( "a média das idades é " + media);
        
        /* "foreach"
        for(int idade : v){
            media+=idade;
        }
        */
    }
    
}
