public class MysteryWord {
	
	private String answer;
	
    public MysteryWord(String word)
    {
		answer = word;
    }
	
	public String getHint(String guess)
	{
		if(guess=="")
		{
			return "No guess entered"; 
		}
		else if(guess.length()!=answer.length()||!guess.toUpperCase().equals(guess))
		{
			return "This guess was just a joke";
		}
		
		String[] temp = guess.split("");
		String[] m = answer.split("");
		String[] hint = temp;
		
		for(int i=0;i<temp.length;i++)
		{
			if(!temp[i].equals(m[i]))
			{
				for(int j=0;j<m.length;j++)
				{
					if(temp[i].equals(m[j]))
					{
						hint[i] = "+";
					}
					else if(j==m.length-1&&!hint[i].equals("+"))
					{
						hint[i] = "*";
					}
				}
			}
		}
		
		String sum="";
		for(int i=0;i<hint.length;i++)
		{
			sum = sum+hint[i];
		}
		return sum;
	}
	
	public int length()
	{
		return answer.length();
	}

	
	public boolean equals(String check)
	{
		if(answer.equals(check))
		{
			return true;
		}
		return false;
	}
	
	
}
