import java.util.ArrayList;

public class GuessWordGame implements GameState
{
	MysteryWord bob;
	Player currPlayer;
	ArrayList<String> moves;
	String cmove="";
		
	public GuessWordGame(String[] words)
	{
		int wordLen = (int)(Math.random()*words.length);
		moves = new ArrayList<String>();
		bob = new MysteryWord(words[wordLen]);
		currPlayer = new Player("Player 1");
		moves.add("The mystery word has: "+words[wordLen].length()+ " letters");
		//System.out.println(moves);
	}
	
	public boolean isGameOver()
	{
		if(bob.equals(moves.get(moves.size()-1)))
		{
			return true;
		}
		return false;
	}
	
	public Player getWinner()
	{
		if(isGameOver())
		{
			return currPlayer;
		}
		return null;
	}
	
	public Player getCurrentPlayer()
	{
		return currPlayer;
	}
	
	public void makeMove(String move)
	{
		moves.add(bob.getHint(move));
		// System.out.println(moves);
		// cmove = move;
		// if(bob.equals(move))
		// {
			// moves.remove(0);
		// }
		// if(!move.equals("no move"));
		// {
			// System.out.println(toString());
		// }	
	}
	
	public ArrayList<String> getCurrentMoves()
	{
		return moves;
	}
	
	private int getMysteryLength()
	{
		return bob.length();
	}
	
	public String toString()
	{
		return getCurrentMoves().get(getCurrentMoves().size()-1) + "\n";
	}		
} 



