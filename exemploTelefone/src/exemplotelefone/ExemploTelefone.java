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
public class ExemploTelefone {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Telefone t1 = new Telefone();
        Telemovel t2 = new Telemovel();
        Smartphone t3 = new Smartphone();
        
        //Utilizando objeto t1
        System.out.println("\n\n Utilizando objeto t1");
        
        t1.setNome("fabgtre");
        t1.setNumero(964946571);
        
        t1.liga();
        t1.telefona();
        t1.desliga();
        
        //Utilizando objeto t2
        System.out.println("\n\n Utilizando objeto t2");
        
        t2.setNome("earht");
        t2.setNumero(4946571);
        
        t2.liga();
        t2.telefona();
        t2.sms("Testando SMS no Telemóvel");
        t2.fotografa();
        t2.desliga();
        
        //Utilizando objeto t3
        System.out.println("\n\n Utilizando objeto t3");
        
        t3.setNome("bhjer");
        t3.setNumero(5412184);
        
        t3.liga();
        t3.telefona();
        t3.sms("Testando SMS no Smartphone");
        t3.fotografa();
        t3.jogar();
        t3.internet();
        t3.gps();
        t3.desliga();
    }
    
}
