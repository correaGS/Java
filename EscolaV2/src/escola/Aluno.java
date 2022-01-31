/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escola;

/**
 *
 * @author Aluno
 */
public class Aluno extends Pessoa{
    private int numero;
    private double nota1;
    private double nota2;
    private double media;
    

    public Aluno(int numero, String nome, int idade, double nota1, double nota2) {
        setNome(nome);
        setIdade(idade);
        setNumero(numero);
        setNota1(nota1);
        setNota2(nota2);
        setMedia(((getNota1() + getNota2()) /2));
    }

    @Override
    public String info() {
        return ("Nome:"+this.getNome()+ " - Idade: "+ this.getIdade() + " - Número: " + this.getNumero() 
                + " - Média: " + this.getMedia()); //To change body of generated methods, choose Tools | Templates.
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
     * @return the nota1
     */
    public double getNota1() {
        return nota1;
    }

    /**
     * @param nota1 the nota1 to set
     */
    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    /**
     * @return the nota2
     */
    public double getNota2() {
        return nota2;
    }

    /**
     * @param nota2 the nota2 to set
     */
    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    /**
     * @return the media
     */
    public double getMedia() {
        return media;
    }

    /**
     * @param media the media to set
     */
    public void setMedia(double media) {
        this.media = media;
    }
    
    
    
}
