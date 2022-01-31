/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forsomamedia;

/**
 *
 * @author Aluno
 */
public class ForSomaMedia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double altura[] = {1.85, 1.79, 1.93, 1.67, 1.72, 1.90, 1.59, 1.63};
        
        double mediaAltura = 0;
        
        System.out.println("Alturas:");
        
        System.out.println("");
        
        for(int i = 0; i <=7; i++){
            
            System.out.println(altura[i]);
            
            mediaAltura += altura[i];
                    
        }
        
        System.out.println("");
        
        mediaAltura /= 8;
        
        System.out.println("Média: " + mediaAltura);
        
    }
    
}
