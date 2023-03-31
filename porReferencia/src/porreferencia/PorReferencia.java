/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package porreferencia;

/**
 *
 * @author danillo.iblima
 */
public class PorReferencia {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int []vetorInteiros = {10,20,30,40,50};
        
        for(int i=0; i< vetorInteiros.length;i++){
            System.out.println(vetorInteiros[i] + " ");
        }
        modificar(vetorInteiros);
        
        System.out.println("\n=== vetor após chamada do método ===");
        for(int i=0;i<vetorInteiros.length;i++){
            System.out.print(vetorInteiros[i] + " ");
        }
    }
    
    static void modificar(int []vetor){
        for(int i = 0; i<vetor.length;i++){
            vetor[i]= vetor[i]/2;
        }
    }
    
}
