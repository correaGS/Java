/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplotelefone;

/**
 *
 * @author Cristiane Corrêa
 */
public class Telefone {
    
    private String nome;
    private int numero;
    private boolean estado;
    
    public Telefone(){
        nome = "";
        numero = 0;
        estado = false;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * @return the estado
     */
    public boolean isEstado() {
        return estado;
    }
    
    public boolean liga(){
        if(estado == true){
            System.out.println("O telefone já está ligado.");
       }else{
        
        estado = true;
        
        System.out.println("Ligando telefone...");
        }
        
        return estado;
        
    }
    
    public boolean desliga(){
        if(!estado){
            System.out.println("...");
       }else{
        
        estado = false;
        
        System.out.println("Desligando telefone...");
        }
        
        return estado;
    }
        
    
    public void telefona(){
        if(!estado){
            System.out.println("...");
        }else{
        
        System.out.println("...Telefonando...");
        }
    }
    
}
