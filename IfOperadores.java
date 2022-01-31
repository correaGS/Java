/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifoperadores;

/**
 *
 * @author Aluno
 */
public class IfOperadores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double preco = 50;
        int quant = 3;
        boolean cartao = true;
        
        double total = preco * quant;
        
        if(total > 100 && cartao == true)
        {
            System.out.println("A compra pode ser parcelada - Total: "+total);
        }
        else
        {
            System.out.println("A compra nâo pode ser parcelada - Total: "+total);
        }
        
    }
    
}
