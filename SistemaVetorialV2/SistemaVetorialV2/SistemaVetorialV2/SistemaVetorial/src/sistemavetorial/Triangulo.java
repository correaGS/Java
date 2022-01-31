/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemavetorial;
import java.awt.Color;
import java.awt.Graphics;
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
 * @author Cristiane Corrêa
 */
public class Triangulo extends Figura{
    
     private double largura;
    private double altura;

    public Triangulo(Grelha grelha) {
        super(grelha);
        largura = 0;
        altura = 0;
    }

    // O IDE gerou estes métodos na criação da classe. Tip: "Implement all abstract methods"...
    @Override
    public void desenha(Graphics g) {
        int x1 = getGrelha().xEcra(getX());
        int y1 = getGrelha().yEcra(getY());
        
        int x2 = getGrelha().xEcra(getX()+getLargura()/2);
        int y2 = getGrelha().yEcra(getY()-getAltura());
        
        int x3 = getGrelha().xEcra(getX()+getLargura());
        int y3 = getGrelha().yEcra(getY());
        
        if ( isSelecionada()) {
            g.setColor(Color.red);
        } else {
            g.setColor(getCor());
        }
        
        g.drawLine(x1, y1, x2, y2);
        g.drawLine(x2, y2, x3, y3);
        g.drawLine(x3, y3, x1, y1);
    }

    @Override
    public String informacao() {
        return new String("Triângulo. X=" + getX() + " Y=" + getY() + " Larg.=" + getLargura() + " Alt.=" + getAltura());
    }

    @Override
    public boolean executaInterface() {
        boolean estado = true;
        
        JTextField textX = new JTextField();
        JTextField textY = new JTextField();
        JTextField textLargura = new JTextField();
        JTextField textAltura = new JTextField();
        JButton buttonCor = new JButton("Cor");
        final JLabel labelCor = new JLabel(" ");
        
        
        labelCor.setBackground(getCor());
        labelCor.setOpaque(true);
        
        
        // listener para botão de seleção de cor
        buttonCor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Color color = JColorChooser.showDialog(null, "Cor do triângulo", getCor());

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
            new JLabel("Largura="),
            textLargura,
            new JLabel("Altura="),
            textAltura,
            buttonCor,
            labelCor
        };
        
       
        
        JOptionPane.showMessageDialog(null, inputs, "Coordenadas do triângulo", JOptionPane.PLAIN_MESSAGE);
        
        // Atualizar os atributos da linha
        
        try {
            setX(Double.parseDouble(textX.getText()));
            setY(Double.parseDouble(textY.getText()));
            setLargura(Double.parseDouble(textLargura.getText()));
            setAltura(Double.parseDouble(textAltura.getText()));
        } catch (NumberFormatException e ) {
            estado = false;
            
        }
       
        return estado;
    }

    /**
     * @return the largura
     */
    public double getLargura() {
        return largura;
    }

    /**
     * @param largura the largura to set
     */
    public void setLargura(double largura) {
        this.largura = largura;
    }

    /**
     * @return the altura
     */
    public double getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }
    
}
