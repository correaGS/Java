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
public class ContaBancaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ContaOrdem c1 = new ContaOrdem();
         
        c1.depositar(50);
         
        System.out.println("\n\nSaldo: " + c1.getSaldo());
        
        if (c1.levantar(25) == true){
            
            System.out.println("\nLevantamento em andamento..."
                             + "\nLevantamento Concluido! - Saldo atual: " + c1.getSaldo());
        }
        else{
            System.out.println("\nLevantamento em andamento..."
                    + "\n Saldo insuficiente - Levantamento cancelado");
        }
    }
    
}
