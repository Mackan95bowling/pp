/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projektet.Model;

import java.util.Random;

/**
 *
 * @author S143534
 */
public class Match {
  int matchid;
   public Match(){
    
    matchID();
    } 
    
    public void matchID(){
        Random matchID = new Random();
       matchid = matchID.nextInt(8888);
    
    System.out.println(" "+matchid);
    }
}
