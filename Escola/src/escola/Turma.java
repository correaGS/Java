/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escola;

import java.util.*;

/**
 *
 * @author Aluno
 */
public class Turma {
    
    ArrayList lista;
    
    public Turma(){
        lista = new ArrayList();
    }
    
    public void adiciona(Pessoa p){
        lista.add(p);
    }
    
    public void remove(Pessoa p){
        lista.remove(p);
    }
    public int tamanho(){
        return lista.size();
    }
    public void chamada(int i){
        lista.get(i);
    }
    
    
}
