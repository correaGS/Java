/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgif;

/**
 *
 * @author Aluno
 */
public class If {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int idadeA = 18;
        int idadeB = 10;
        
        if(idadeA > idadeB)
        {
            System.out.println("A é mais velho que B");
        }
        if(idadeA < idadeB)
        {
            System.out.println("B é mais velho que A");
        } 
        else 
        {
            System.out.println("A e B tem a mesma idade");
        }
  
        
    }
    
}
