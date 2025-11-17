/*
 * Activity 2.2.2
 *
 *  The PhraseSolver class the PhraseSolverGame
 */
import java.util.Scanner;
  
public class PhraseSolver
{
  Player player1 = new Player("");
  Player player2 = new Player("");
  Player player3 = new Player("");
  Board game = new Board();
  boolean solved = false;

  public PhraseSolver(){
    player1 = null;
    player2 = null;
    player3 = null;
    game = null;
    solved = false;

  }

  

  /* your code here - constructor(s) */ 

  public void play()
  {
    boolean solved = false;
    int currentPlayer = 1;

    Scanner input = new Scanner(System.in);
    
    boolean correct = true;
    while (!solved) 
    {
      
      /* your code here - game logic */
      
      
      /* your code here - determine how game ends */
      solved = true; 
    } 
   
  }
  
}