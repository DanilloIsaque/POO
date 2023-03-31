/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package porvalor;

/**
 *
 * @author danillo.iblima
 */
public class PorValor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a = 50;
        modificar(a);
        System.out.println("Main: valor de a "+ a);
        
    }
    static void modificar(int a ){
        a = 200;
        System.out.println("metodo: valor de a " + a);
    }
    
}
