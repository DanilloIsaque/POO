/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funcao3;
import java.util.Scanner;
/**
 *
 * @author danillo.iblima
 */
public class Funcao3 {
    static boolean isPar(int n1){
        boolean valor;
        
        if(n1%2==0){
            valor = true;
        }
        else{
            valor = false;
        }
        
        return valor;
          
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        System.out.println("digite um numero ");
        
        int numero = entrada.nextInt();
        
        boolean v = isPar(numero);
        
        System.out.println(v);
        
    }
    
}
