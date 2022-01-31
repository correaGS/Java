/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemavetorial;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author alexandrebarao
 */
public class Circulo extends Figura {

    private double raio;
   
    public Circulo(Grelha grelha) {
        super(grelha);
        raio = 1;
        
    }

    // O IDE gerou estes métodos na criação da classe. Tip: "Implement all abstract methods"...
    @Override
    public void desenha(Graphics g) {
        
        int raioPixeis = getGrelha().xEcra(getX()+getRaio()) - getGrelha().xEcra(getX());
        
        int x = getGrelha().xEcra(getX())-raioPixeis;
        int y = getGrelha().yEcra(getY())-raioPixeis;
        
        
        if ( isSelecionada()) {
            g.setColor(Color.red);
        } else {
            g.setColor(getCor());
        }
        
        g.drawOval(x, y, raioPixeis*2, raioPixeis*2);
        
    }

    @Override
    public String informacao() {
        return new String("Circulo. X=" + getX() + " Y=" + getY() + " Raio=" + getRaio() );
    }

    @Override
    public boolean executaInterface() {
        boolean estado = true;
        
        JTextField textX = new JTextField();
        JTextField textY = new JTextField();
        JTextField textRaio = new JTextField();
        
        JButton buttonCor = new JButton("Cor");
        final JLabel labelCor = new JLabel(" ");
        
        
        labelCor.setBackground(getCor());
        labelCor.setOpaque(true);
        
        
        // listener para botão de seleção de cor
        buttonCor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Color color = JColorChooser.showDialog(null, "Cor do circulo", getCor());

                if ( color != null ) {
                    setCor(color);
                    labelCor.setBackground(getCor());
                }
            }
        });
        /////////////////////////////
        
        
        final JComponent[] inputs = new JComponent[]{
            new JLabel("X="),
            textX,
            new JLabel("Y="),
            textY,
            new JLabel("Raio="),
            textRaio,
            buttonCor,
            labelCor
        };
        
       
        
        JOptionPane.showMessageDialog(null, inputs, "Coordenadas do circulo", JOptionPane.PLAIN_MESSAGE);
        
        // Atualizar os atributos da linha
        
        try {
            setX(Double.parseDouble(textX.getText()));
            setY(Double.parseDouble(textY.getText()));
            setRaio(Double.parseDouble(textRaio.getText()));
           
        } catch (NumberFormatException e ) {
            estado = false;
            
        }
        
        
        
      
        
        return estado;
        
    }

    

   
    /**
     * @return the raio
     */
    public double getRaio() {
        return raio;
    }

    /**
     * @param raio the raio to set
     */
    public void setRaio(double raio) {
        this.raio = raio;
    }

    
}
