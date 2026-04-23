package bowling;

public class Bowling {
	int[] rolls = new int[21];
	// on vas enrigistrer le resultat de chaque lancer
	int indice = 0;

	public void roll(int nbQuilles) {
		rolls[indice++] = nbQuilles;
	}

	public int score() {
		int score = 0;
		int i = 0;

		for (int frame = 0; frame < 10; frame++) {
			if (isStrike(i)) {
				score += 10 + rolls[i + 1]+rolls[i + 2]; // 10 + bonus du lancer suivant
				i += 1;
			}
			if (isSpare(i)) {
				score += 10 + rolls[i + 2]; // 10 + bonus du lancer suivant
				i += 2;
			} else {
				score += rolls[i] + rolls[i + 1]; // Score normal
				i += 2;
			}
		}
		return score;
	}

	private boolean isSpare(int i) {
		return rolls[i] + rolls[i + 1] == 10;
	}
	private boolean isStrike(int i){
		return rolls[i] == 10;
		
	}

}
