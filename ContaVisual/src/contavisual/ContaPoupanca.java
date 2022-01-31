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
public class ContaPoupanca extends Conta{
   
    private double juro;
    
    public ContaPoupanca(){
        super();
        juro = 1.05;
    } 
    
        public boolean levantar (double valor){
        
        return false;
    }
        
    public double getSaldo() {
        return super.getSaldo() * juro;
    }
    
}
