/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contabancaria;

/**
 *
 * @author Cristiane Corrêa
 */
public class Conta {
    
    private double saldo;
    
    public Conta(){
        saldo = 0.0;
    }
    
    public void depositar(double valor){
        saldo += valor;
        System.out.println("Foi depositado: " + valor + "\nSaldo atual: " + getSaldo());
    }
    
    public boolean levantar (double valor){
        
        boolean estado = true;
        
        if (valor > getSaldo()){
        
            estado = false;
            System.out.println("\nLevantamento de: " + valor + " em andamento... "
                    + "\nSaldo insuficcente! Levantamento cancelado");
            
        }
        else{
            
            saldo -= valor;
            System.out.println("\nLevantamento de: " + valor + " em andamento..."
                    + "\nLevantamento Concluido!");
            
        }
        
        return estado;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }
    
}
