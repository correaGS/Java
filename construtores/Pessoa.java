/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package construtores;

/**
 *
 * @author Cristiane Corrêa
 */
public class Pessoa {
    
    private String nome;
    
    public Pessoa()
    {
    
        nome="";
        System.out.println("Nasci!");
    
    }
    
    public Pessoa(String nome){
        
        this.nome = nome;
        System.out.println("Nasci e chamo-me " + nome);
        
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
}
