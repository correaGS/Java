/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu;
import java.io.IOException;
import java.util.Scanner;
/**
 *
 * @author Aluno
 */
public class Menu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        String nome;
        char op = ' ';
        int quant = 0;
        double preco = 0;
        double total;
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Nome: ");
        nome = in.nextLine();
        
        do{
            
            System.out.println("\n\n\n_____ Menu_____");
            System.out.println("P - Inseri preço");
            System.out.println("Q - Inseri Quantidade");
            System.out.println("C - Calcula");
            System.out.println("F - Finaliza");
            
            System.out.println(nome + " - Escolha um das OPÇÕES: ");
            op = (char) System.in.read();
            
            System.out.println("");
            
            switch(op){
                
                case 'P':
                    
                    System.out.println("Digite o Preço: ");
                    preco = in.nextDouble();
                    
                break;
                    
                case 'p':
                    
                    System.out.println("Digite o Preço: ");
                    preco = in.nextDouble();
                    
                break;
                    
                case 'Q':
                    
                    System.out.println("Digite a Quantidade: ");
                    quant = in.nextInt();
                    
                break;
                    
                case 'q':
                    
                    System.out.println("Digite a Quantidade: ");
                    quant = in.nextInt();
                    
                break;
            }
            
            total = preco * quant;
            
            System.out.println("Total: " + total + " ( " + preco + " * " + " " + quant + " )");
            
        }while(op != 'f' && op != 'F');
        
        System.out.println(nome + " - Até a próxima!");
    }
    
}
