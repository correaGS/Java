/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemavetorial;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JColorChooser;

/**
 *
 * @author Aluno
 */
public abstract class Figura {
    private Grelha grelha;
    
    private double x, y;
    
    private Color cor;
    
    private boolean selecionada;
    
    public Figura(Grelha grelha) {
    
    this.grelha = grelha;
    x=0;
    y=0;
    
    cor = Color.black;
    
    selecionada = false;
    
    }
    
    public abstract void desenha(Graphics g);
    public abstract String informacao();
    public abstract boolean executaInterface();
    
    /**
     * @return the grelha
     */
    public Grelha getGrelha() {
        return grelha;
    }

    /**
     * @param grelha the grelha to set
     */
    public void setGrelha(Grelha grelha) {
        this.grelha = grelha;
    }

    /**
     * @return the x
     */
    public double getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(double x) {
        this.x = x;
    }

    /**
     * @return the y
     */
    public double getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(double y) {
        this.y = y;
    }

    /**
     * @return the cor
     */
    public Color getCor() {
        return cor;
    }

    /**
     * @param cor the cor to set
     */
    public void setCor(Color cor) {
        this.cor = cor;
    }

    /**
     * @return the selecionada
     */
    public boolean isSelecionada() {
        return selecionada;
    }

    /**
     * @param selecionada the selecionada to set
     */
    public void setSelecionada(boolean selecionada) {
        this.selecionada = selecionada;
    }
}
