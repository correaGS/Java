/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagnostico;

/**
 *
 * @author Aluno
 */
public class Pessoa {
    
    private String nome;
    
    public void dirige(Veiculo v){
        
        System.out.println(nome + " está a dirigir!");
        v.buzinar();
    }
    
    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
}
