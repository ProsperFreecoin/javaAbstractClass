/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package notification;

/**
 *
 * @author freecoin
 */
public class EnvoiSms extends Notification {
     public  EnvoiSms(String destinataire){
        super(destinataire);
    }
    
    @Override
    public void envoyer(){
        System.out.println(destinataire +" vous avez reçu un sms");
    }
}
