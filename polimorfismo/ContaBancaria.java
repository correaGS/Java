/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;
import java.util.ArrayList;

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
        
        ArrayList lista = new ArrayList(); 
        
        ContaOrdem co = new ContaOrdem();
        ContaJovem cj = new ContaJovem();
        ContaPoupanca cp = new ContaPoupanca();
        
        co.depositar(50);
        cj.depositar(100);
        cp.depositar(150);
        
        lista.add(co);
        lista.add(cj);
        lista.add(cp);

        
        for(int i = 0; i<lista.size(); i++){
            
            Conta c = (Conta) lista.get(i);
            
            System.out.println("\ni:  " + i + " - Saldo: " + c.getSaldo());
            
        }
        
    }
    
}
