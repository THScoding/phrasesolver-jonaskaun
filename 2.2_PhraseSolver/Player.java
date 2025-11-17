/*
 * Activity 2.2.2
 * 
 * A Player class the PhraseSolverGame
 */
import java.util.Scanner;

public class Player
{
  String name = "";
  int points = 0;

  public Player(){
    Scanner sc = new Scanner(System.in);
    System.out.println("input your name: ");
    String playerName = sc.nextLine();
    points = 0;
    System.out.println("WELCOME "+playerName+ " to this phrase solver game");
    
  }
  public Player(String inputName ){
    String playerName = inputName;
    points = 0;
    System.out.println("WELCOME "+playerName+ " to this phrase solver game");


  }


  /* your code here - constructor(s) */ 

  /* your code here - accessor(s) */ 

  /* your code here - mutator(s) */ 
}