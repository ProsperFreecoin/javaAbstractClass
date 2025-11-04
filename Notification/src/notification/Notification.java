/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package notification;

/**
 *
 * @author freecoin
 */
public abstract class  Notification {
    protected String destinataire;
    
    public Notification(String destinataire){
        this.destinataire = destinataire;
    }
    
    public abstract void envoyer();
}


