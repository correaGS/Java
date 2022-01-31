/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemavetorial;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Cristiane Corrêa
 */
public class Grelha {
    
    private int xini;
    private int yini;
    private int escala;
    private int nescala;
    private boolean visivel;
    
    public Grelha(){
        xini = 0;
        yini = 0;
        escala = 50;
        nescala = 10; 
    }
    
    public int xEcra(double xGrelha){
        return (int) (xini + xGrelha * escala);
    }
    
    public int yEcra(double yGrelha){
        return (int) (yini + yGrelha * escala);
    }
     
     
     public void desenhaGrelha(Graphics g){
         //limpar painel
         g.setColor(Color.white);
         g.fillRect(0, 0, 1000, 1000);
         
         if (visivel){
         g.setColor(Color.lightGray);
         
        int i,x1,y1,x2,y2;
        
        for ( i=0; i <= getNescala(); i++){
            x1 = xini + i * getEscala();
            x2 = x1;
            
            y1 = yini;
            y2 = y1 + getNescala() * getEscala();
            
            g.drawLine(x1, y1, x2, y2);
        }
        
        for ( i=0; i<=getNescala(); i++){
            y1 = yini + i * getEscala();
            y2 = y1;
            
            x1 = xini;
            x2 = x1 + getNescala() * getEscala();
            
            g.drawLine(x1, y1, x2, y2);
        }
        }
         
     }

    /**
     * @return the xini
     */
    public int getXini() {
        return xini;
    }

    /**
     * @param xini the xini to set
     */
    public void setXini(int xini) {
        this.xini = xini;
    }

    /**
     * @return the yini
     */
    public int getYini() {
        return yini;
    }

    /**
     * @param yini the yini to set
     */
    public void setYini(int yini) {
        this.yini = yini;
    }

    /**
     * @return the visivel
     */
    public boolean isVisivel() {
        return visivel;
    }

    /**
     * @param visivel the visivel to set
     */
    public void setVisivel(boolean visivel) {
        this.visivel = visivel;
    }

    /**
     * @return the escala
     */
    public int getEscala() {
        return escala;
    }

    /**
     * @param escala the escala to set
     */
    public void setEscala(int escala) {
        this.escala = escala;
    }

    /**
     * @return the nescala
     */
    public int getNescala() {
        return nescala;
    }

    /**
     * @param nescala the nescala to set
     */
    public void setNescala(int nescala) {
        this.nescala = nescala;
    }
    
}
