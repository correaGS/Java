/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemavetorial;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.AdjustmentEvent;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Aluno
 */
public class Linha extends Figura{
    
    private double x2, y2;
    
    public Linha (Grelha grelha){
        super(grelha);
        x2 = 0;
        y2 = 0;
    }

    /**
     * @return the x2
     */
    public double getX2() {
        return x2;
    }

    /**
     * @param x2 the x2 to set
     */
    public void setX2(double x2) {
        this.x2 = x2;
    }

    /**
     * @return the y2
     */
    public double getY2() {
        return y2;
    }

    /**
     * @param y2 the y2 to set
     */
    public void setY2(double y2) {
        this.y2 = y2;
    }

    @Override
    public void desenha(Graphics g) {
    
        int x1 = getGrelha().xEcra(getX());
        int y1 = getGrelha().yEcra(getY()); 
        int x2 = getGrelha().xEcra(getX2());
        int y2 = getGrelha().yEcra(getY2());
        
        if ( isSelecionada()) {
            g.setColor(Color.red);
        }else{
           g.setColor(getCor());
        }
        
        g.drawLine(x1, y1, x2, y2);
    }

    @Override
    public String informacao() {
     return new String ("Linha. X1 = " + getX() + ", Y1 =" + getY() + ", X2 =" + getX2() + ", Y2 =" + getY2());   
    }

    @Override
    public boolean executaInterface() {
        boolean estado = true;
        
        JTextField textX1 = new JTextField();
        JTextField textY1 = new JTextField();
        JTextField textX2 = new JTextField();
        JTextField textY2 = new JTextField();
        JButton buttonCor = new JButton("Cor");
        final JLabel labelCor = new JLabel(" ");
        
        labelCor.setBackground(getCor());
        labelCor.setOpaque(true);
        
        buttonCor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Color color = JColorChooser.showDialog(null, "Cor da Linha", getCor());
                
                if (color != null){
                    setCor(color);
                    labelCor.setBackground(getCor());
                }
            }
        });
        final JComponent[] inputs = new JComponent[]{
        new JLabel ("X1 = "),
        textX1,
        new JLabel ("Y1 = "),
        textY1,
        new JLabel ("X2 = "),
        textX2,
        new JLabel ("Y2 = "),
        textY2,
        buttonCor,
        labelCor
        
        };
        JOptionPane.showMessageDialog(null, inputs, "Coordenadas da Linha", JOptionPane.PLAIN_MESSAGE);
        
        try {
            setX(Double.parseDouble(textX1.getText()));
            setY(Double.parseDouble(textY1.getText()));
            setX2(Double.parseDouble(textX2.getText()));
            setY2(Double.parseDouble(textY2.getText()));
            
        }  catch (NumberFormatException e){
            estado = false;
        }  
        
        return estado;
    }
    
    
}
