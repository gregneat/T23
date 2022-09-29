import java.util.ArrayList;

public interface GameState
{
	boolean isGameOver();
	Player getWinner();
	Player getCurrentPlayer();
	ArrayList<String> getCurrentMoves();
	void makeMove(String move);
	String toString();

}
