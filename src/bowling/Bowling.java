package bowling;

public class Bowling {
	
	int scoreTotal =0;
	public void roll(int nbQuilles) {
		scoreTotal = scoreTotal + nbQuilles;
	}
	public int score()
	{
		return scoreTotal;
	}
	
		

}
