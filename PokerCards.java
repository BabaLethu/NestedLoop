/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nestedloopsnamansharma;
import javax.swing.*;

/**
 *
 * @author naman
 */
public class PokerCards {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numPlayers = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of players"));
        String cardName, suit = null;
        
        for (int i = 1; i <= numPlayers; i++)
        {
            String playerName = JOptionPane.showInputDialog("Enter the name of player " + i + ":");
            System.out.println(playerName + "'s cards");
            
            for (int x = 1; x <= 5; x++) 
            {
                
                int randomName = (int) (Math.random() * 13) + 1;

                if (randomName == 1)    
                {
                    cardName = "Ace";
                } 
                else if (randomName == 11) 
                {
                    cardName = "Jack";
                } 
                else if (randomName == 12) 
                {
                    cardName = "Queen";
                } 
                else if (randomName == 13) 
                {
                    cardName = "King";
                } 
                else 
                {
                    cardName = String.valueOf(randomName);
                }


                int randomSuit = (int) (Math.random() * 4) + 1;

                if (randomSuit == 1)
                {
                    suit = "Hearts";
                }
                else if (randomSuit == 2)
                {
                    suit = "Diamonds";
                }
                else if (randomSuit == 3)
                {
                    suit = "Clubs";
                }
                else if (randomSuit == 4)
                {
                    suit = "Spades";
                }
                
     
                System.out.print(cardName + " of " + suit + "\n");
            }
            System.out.println();
        }
    }
    
}
