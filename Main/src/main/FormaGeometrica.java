/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;


public abstract class FormaGeometrica {

    private String nome;

    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
   
    
    public FormaGeometrica(){}
    
    public FormaGeometrica(String nome){
        this.nome=nome;
    }
    
    public abstract double calcularArea();


    public String imprimir() {
        return "FormaGeometrica: " + "nome=" + nome ;//alt+insert
    }
    
    
}
