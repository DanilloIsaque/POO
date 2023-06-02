/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import javax.swing.JOptionPane;

/**
 *
 * @author danillo.iblima
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
      // FormaGeometrica objF = new FormaGeometrica(); n instancia
      Circulo objCirculo= new Circulo("circulo",24.3);
        System.out.println(objCirculo.imprimir());
        
        Quadrado objQuadrado = new Quadrado("quadrado", 4);
        System.out.println(objQuadrado.imprimir());
       
        
        if(objCirculo instanceof FormaGeometrica){//verifica se ele é da classe
            System.out.println("é da forma geometrica");
        }
        if(objQuadrado instanceof FormaGeometrica){
            System.out.println(objQuadrado.getNome()+ " é da forma geometrica");
        }
        
        if(objCirculo instanceof Circulo){
            System.out.println(objCirculo.getNome()+" é do tipo circulo");
        }
        
        JOptionPane.showInputDialog(null,
                "Menu\n1-adicionar\n2-listar");
    }
    
}
