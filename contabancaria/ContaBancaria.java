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
public class ContaBancaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Conta c1 = new Conta();
         
         c1.depositar(50);
         c1.levantar(25);
         
         System.out.println("\n\nSaldo: " + c1.getSaldo());
        
    }
    
}
