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
    int incrementer = 1;

    String guess = input.nextLine();
    System.out.println(guess);
  
    String phrase = game.getPhrase();
    System.out.println(phrase);
    String phraseOne = "";



    if (guess.length() == 1){
        System.out.println("1 letter");
        for (int t = 0;t<phrase.length();t+=1){
          String a = phrase.substring(t,t+1);
        
          if (a.equals(guess)){
            phraseOne += guess;
            
          }
          else if (a.equals(" ") ){
            phraseOne += " ";
          }
          else{
            phraseOne += "_";
          }
        }
        System.out.println(phraseOne);
        System.out.println("");
          

      }
        
      
    else {
      System.out.println("full phrase");
      if (guess.equals(phrase)){
        solved = true;
        System.out.println("you did it");
      }
      else{
        System.out.println("incorrect");
      }
    
    
    


      

    

    
  
      
      
     
      
      
      


        




      
    while(solved == false){
      incrementer++;
      if ((incrementer%2) == 0){
        currentPlayer = 2;
        
      }
      else {
        currentPlayer = 1;
      }
      
      
      
      System.out.println("Player "+currentPlayer+ ": input your guess");
      
      
      String guess2 = input.nextLine();
      System.out.println(guess2);
  
        
      String phrase2 = "";
      
      
      if (guess2.length() == 1){
        System.out.println("1 letter");
        for (int t = 0;t<phraseOne.length();t+=1){
          String a = phraseOne.substring(t,t+1);
        
          if (a.equals(guess2)){
            phrase2 += guess2;
            
          }
          else if (a.equals(" ") ){
            phrase2 += " ";
          }
          else{
            phrase2 += "_";
          }
        }
        System.out.println(phrase2);
        System.out.println("");
          

      }
        
      
      else {
        System.out.println("full phrase");
        if (guess.equals(phraseOne)){
          solved = true;
          System.out.println("you did it");
        }
        else{
          System.out.println("incorrect");
        }

      }
      
      
    }
    input.close();
      /* your code here - game logic */
      
      
      /* your code here - determine how game ends */
      
    } 

   solved = true; 
  }
  
  
}
  
