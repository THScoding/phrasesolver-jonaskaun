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
  
  Board game = new Board();
  boolean solved = false;

  public PhraseSolver(){
    player1 = null;
    player2 = null;
    
    
    solved = false;

  }

  

  /* your code here - constructor(s) */ 

  public void play()
  {
    boolean solved = false;
    int currentPlayer = 1;
    Scanner input = new Scanner(System.in);
    
    
    


      

    

    
    
    
    while (solved != true) 
    {
      System.out.println("input your guess");
      
      String guess = input.nextLine();
      System.out.println(guess);
  
      String sigma = game.getPhrase();
      System.out.println(sigma);
      
      if (guess.length() == 1){
        System.out.println("1 letter");
        
      }
      else {
        System.out.println("full phrase");
        if (guess.equals(sigma)){
          solved = true;
          System.out.println("you did it");
        }
        else{
          System.out.println("incorrect");
        }


      }
      
      /* your code here - game logic */
      
      
      /* your code here - determine how game ends */
      
    } 
    solved = true; 
   
  }
  
} 