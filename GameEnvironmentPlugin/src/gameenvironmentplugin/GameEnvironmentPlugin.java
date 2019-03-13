package gameenvironmentplugin;
import java.awt.EventQueue;
import java.util.ArrayList;
import javax.swing.JFrame;

//Public Class
public class GameEnvironmentPlugin extends JFrame
{
    
    // Place holder for the game
    Game myGame = new CheckersGame();
    
   public GameEnvironmentPlugin(String title)
   {
        super(title);       
        //Add pieces to the board
        GameBoard myBoard = myGame.createGameBoard();
        setContentPane(myBoard);
        pack();
        setVisible(true);
   }

}

