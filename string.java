/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string;

/**
 *
 * @author Aluno
 */
public class string {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String nome = "Gabriel"; 
        String apelido = "Corrêa";
        String nomeApelido;
        
        nomeApelido = nome + " " + apelido;
        
        System.out.println(nome);
        System.out.println(apelido);
        System.out.println(nomeApelido);
        
        System.out.println("Caracteres: " + nomeApelido.length());

    }
    
}
