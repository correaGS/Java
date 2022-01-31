/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Aluno
 */
public class Pessoa {
    private int id;
    private String nome;
    private String email;
    private int telemovel;
    
    public Pessoa(int id, String nome, String email, int telemovel){
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.telemovel =  telemovel;
    }
    
    public Pessoa(){
        
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
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
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the telemovel
     */
    public int getTelemovel() {
        return telemovel;
    }

    /**
     * @param telemovel the telemovel to set
     */
    public void setTelemovel(int telemovel) {
        this.telemovel = telemovel;
    }
    
    public String informacao(){
        String info = "ID: " + id + "  |  Nome: " + nome + "  |  Email: "
                + email + "  |  Telemovel: " + telemovel;
        
        return info;
    }
}
