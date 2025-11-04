/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package notification;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author freecoin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      List<Notification> notif = new ArrayList<> ();  
      //notif est le nom de la liste
      notif.add(new EnvoiSms("Ton modia"));
      notif.add(new EnvoiMail("Ton babieh"));
      
      for(Notification n : notif){
          n.envoyer();
      }//n est le nom de la variable.  
    }
}
    