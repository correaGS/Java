/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contavisual;

/**
 *
 * @author Cristiane Corrêa
 */
public class ContaJovem extends ContaOrdem{
    
    private double limite;
    
    public ContaJovem(){
        
        super();
        limite = 50.0;
    }
    
        public boolean levantar (double valor){
        
        boolean estado = false;
        
        if(valor <= limite){
        
         estado = super.levantar(valor);
            
        }else{
            System.out.println("Levantamento excede o limite ("+limite+")"
                    + "\nLevantamento Cancelado");
        }
        
        return estado;
    }
    
}
