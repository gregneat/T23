public class RandomPlayer extends Player{
		
		public RandomPlayer(String aName)
		{
			super(aName);
		}
		
		public String getNextMove(GameState state)
		{	
			if(state.getCurrentMoves().size()==0)
			{
				return "no moves";
			}
			
			int x = Math.random*state.getCurrentMoves().size();
			return state.getCurrentMoves().get(x);
		}
} 
