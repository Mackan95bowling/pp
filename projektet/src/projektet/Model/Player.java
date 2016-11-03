/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projektet.Model;

/**
 *
 * @author S143534
 */
public class Player extends User {
    
   
    Player(){
    
    
    }
     //Create Match 
    void createMatch(/*User player x2, Game */){
        Match match = new Match();
    //kanske skapa ett matchobject?
        
    //anrop till Handle Game 
        
        System.out.println("Match created");
        
    }
    
   void playGame(){
   
   /*handler på en knapp Ex. Start game
    * när den klickas startar man ett game på
    * matchobjeketet
    */ 
   System.out.println("Game Started");
   }
    
}
