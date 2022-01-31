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
public class Construtores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Pessoa p1 = new Pessoa("Fernando");
        Pessoa p2 = new Pessoa("Pedro");
        
        System.out.println(p1.getNome());
        System.out.println(p2.getNome());
        
    }
    
}
