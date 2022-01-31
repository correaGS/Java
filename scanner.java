/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scanner;
import java.util.Scanner;
/**
 *
 * @author Aluno
 */
public class scanner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String nome;
        int quant;
        double preco = 2.5;
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Nome: ");
        nome = in.nextLine();
        
        System.out.println("");
        
        System.out.println("Quantidade: ");
        quant = in.nextInt();
        
        System.out.println("");
        
        double total = preco * quant;
        
        System.out.println(nome + " comprou " + quant + " totalizando: " + total);
        
        
    }
    
}
