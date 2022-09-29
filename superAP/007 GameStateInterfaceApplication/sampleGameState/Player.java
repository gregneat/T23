public class Player
{
		private String name;
		
		public Player(String aName)
		{
			name = aName;
		}
		
		public String getName()
		{	
			return name;
		}
		
		public String getNextMove(GameState state)
		{
			EasyReader er = new EasyReader();
			System.out.println(state.toString());
			String move = er.readLine();
			
			if(!move.equals(""))
			{
				return move;
			}
			
			return "no move";
		}
} 
