public class GameDriver {
	
	private GameState state;
	
    public GameDriver(GameState intial)
    {
		state = intial;
    }
	
	public void play()
	{
		EasyReader er = new EasyReader();
		System.out.println("Initial state: " + state);
		
		while(!state.isGameOver())
		{
			Player currPlayer = state.getCurrentPlayer();
			String currMove = currPlayer.getNextMove(state);
			System.out.println(currPlayer.getName() + ": " + currMove);
			state.makeMove(currMove);
		}
		
		if(state.getWinner()!=null)
		{
			System.out.println("\n"+state.getWinner().getName() + " wins!!!");
			System.out.println("You guessed it. Congratz!!!");
		}
		else
		{
			System.out.println("Game ends in a draw");
		}
		
	}
	
}


// C:\Users\joe scofield\Desktop\Homework\HW#ss10>java -cp ; psvm
// Initial state: No guess entered
// Possible moves: [Guess the 4 letter word (all caps)]
// COMP
// Player 1: COMP
// ****
// Possible moves: [Guess the 4 letter word (all caps)]
// PINE
// Player 1: PINE
// **++
// Possible moves: [Guess the 4 letter word (all caps)]
// NEAR
// Player 1: NEAR
// NEA*
// Possible moves: [Guess the 4 letter word (all caps)]
// NEAT
// Player 1: NEAT
// NEAT
// Possible moves: []

// Player 1 wins!!
// You guessed it. Congratz!!!

// C:\Users\joe scofield\Desktop\Homework\HW#ss10>pause
// Press any key to continue . . .
