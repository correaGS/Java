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
public class ContaBancaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ContaOrdem c1 = new ContaOrdem();
         
        c1.depositar(100);
        c1.levantar(25);
         
        System.out.println("\n\nSaldo: " + c1.getSaldo());

        
        ContaJovem cj = new ContaJovem();
        
        cj.depositar(100);
        cj.levantar(60);
        
        System.out.println("\n\nConta Jovem - Saldo: " + cj.getSaldo());
        
        cj.levantar(20);
        System.out.println("\n\nConta Jovem - Saldo: " + cj.getSaldo());
    }
    
}
