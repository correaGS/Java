/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heranca;

/**
 *
 * @author Cristiane Corrêa
 */
public abstract class Conta {
    
    private double saldo;
    
    public Conta(){
        saldo = 0.0;
    }
    
    public void depositar(double valor){
        saldo = getSaldo() + valor;
        System.out.println("Foi depositado: " + valor + "\nSaldo atual: " + getSaldo());
    }
    
    public boolean levantar (double valor){
        
        boolean estado = true;

        saldo = getSaldo() - valor;
        return estado;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }
    
}
