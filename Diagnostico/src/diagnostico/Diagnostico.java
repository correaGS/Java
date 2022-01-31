/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagnostico;

/**
 *
 * @author Aluno
 */
public class Diagnostico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();
        Carro v1 = new Carro();
        Mota v2 = new Mota();
        
        p1.setNome("Gabriel");
        p1.dirige(v1);
        
        System.out.println("\n\n\n");
        
        p2.setNome("Fernando");
        p2.dirige(v2);
        
    }
    
}
