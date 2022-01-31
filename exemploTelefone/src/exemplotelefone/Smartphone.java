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
public class Smartphone extends Telemovel{
    
    public Smartphone(){
        super();
    }
    
    public void jogar(){
        if(!super.isEstado()){
            System.out.println("...");
        }else{
        
        System.out.println("Iniciando jogo..... Jogando....");
        }
    }
    
    public void internet(){
        if(!super.isEstado()){
            System.out.println("...");
        }else{
        
        System.out.println("Navegando .... Click! .....");
        }
    }
    
    public void gps(){
        if(!super.isEstado()){
            System.out.println("...");
        }else{
        
        System.out.println("Recalculando Rota....");
        } 
    }

    @Override
    public void sms(String txt) {
        super.sms(txt); //To change body of generated methods, choose Tools | Templates.
        System.out.println("SMS Enviado por - " + super.getNumero());
    }
    
}
