/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escola;

/**
 *
 * @author Aluno
 */
public class Escola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Turma t;
        
        t = new Turma();
        t.adiciona( new Aluno(1, "a", 16, 10, 15));
        t.adiciona( new Aluno(2, "b", 15, 11, 15));
        t.adiciona( new Aluno(3, "c", 14, 12, 15));
        t.adiciona( new Aluno(4, "d", 15, 13, 15));
        t.adiciona( new Aluno(5, "e", 17, 14, 15));
        t.adiciona( new Aluno(6, "f", 16, 15, 15));
        t.adiciona( new Aluno(7, "g", 15, 16, 15));
        t.adiciona( new Aluno(8, "h", 15, 17, 15));
        t.adiciona( new Aluno(9, "i", 14, 18, 15));
        t.adiciona(new Aluno(10, "j", 18, 10 , 15));
        t.adiciona( new Professor("PSI", "Professor A", 27));
        
        
        System.out.println("Lista da Turma");
        for(int i = 0; i < t.tamanho(); i++){
        ((Pessoa)(t.lista.get(i))).getNome();
        
        }
                
    }
    
}
