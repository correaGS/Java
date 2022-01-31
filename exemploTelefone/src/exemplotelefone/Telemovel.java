/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplotelefone;

/**
 *
 * @author Cristiane Corrêa
 */
public class Telemovel extends Telefone{
    
    public Telemovel(){
        super();
    }
    
    public void sms(String txt){
        if(!super.isEstado()){
            System.out.println("...");
        }else{
        
        System.out.println("Mensagem - " + txt + " - Enviada!");
        }
    }
    
    public void fotografa(){
        if(!super.isEstado()){
            System.out.println("...");
        }else{
        
        System.out.println("Click!");
        }
    }
}
