/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgswitch;

/**
 *
 * @author Aluno
 */
public class Switch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int posicao = 1;
        
        switch(posicao)
        {
            case 1: System.out.println("Medalha de OURO");
            break;
            
            case 2: System.out.println("Medalha de PRATA");
            break;
            
            case 3: System.out.println("Medalha de BRONZE");
            break;
            
            default: System.out.println("Medalha de PARTICIPAÇÃO");
        }
    }
    
}
