/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heranca2;

/**
 *
 * @author Cristiane Corrêa
 */
public class ContaOrdem extends Conta{
    
    public ContaOrdem(){
        super();
    }
    
    public boolean levantar (double valor){
        
        boolean estado = false;
        
        if(valor <= getSaldo()){
        
         estado = super.levantar(valor);
            
        System.out.println("\nLevantamento de " + valor + " em andamento..."
                    + "\nLevantamento Concluido! - Saldo atual: " + getSaldo());
        }
        else{
            System.out.println("\nLevantamento em andamento..."
                    + "\n Saldo insuficiente - Levantamento cancelado");
        }
        
        return estado;
    }
    
}
