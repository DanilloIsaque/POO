/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author danillo.iblima
 */
public  class Circulo extends FormaGeometrica{ 

     private double raio;
     private final double pi = 3.14159;
     
    public double getRaio() {
        return raio;
    }

    /**
     * @param raio the raio to set
     */
    public void setRaio(double raio) {
        this.raio = raio;
    }
//tem q implementar o método abstrato
    
   
    
    public Circulo(){
    super();
    }
    
    public Circulo(String nome, double raio){
        super(nome);
        this.raio=raio;
    }
    
    @Override
    public double calcularArea(){
        return pi*(raio*raio);
    }
    
    @Override


    public String imprimir() {
        return super.imprimir()+
                ",raio" + "raio=" + raio + "\narea="+ calcularArea();
    }
    
}
