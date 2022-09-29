class psvm {
        public static void main(String args[])
        {
			String[] a = {"NEAT","CALIFORNIA","PHONE","LOG"};
			GameState g = new GuessWordGame(a);
			GameDriver game = new GameDriver(g);
			game.play();
		}
}