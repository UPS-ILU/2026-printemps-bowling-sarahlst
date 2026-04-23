package bowling;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BowlingTest {
	private Bowling game;

	@BeforeEach
	void setUp() {
		game = new Bowling();
	}

	// 1 scénario précis = 1 méthode @Test différente.
	@Test
	void test1() {
		// on roll rien du coup le score == 0
		assertEquals(0, game.score());
	}

	@Test
	void test2() {
		// on roll 20 fois et le score ==0 ( on a rien battu)
		for (int i = 0; i < 20; i++) {
			game.roll(0);
		}
		assertEquals(0, game.score());
	}

	@Test
	void test3() {
		// on roll 20 fois et a chaque lancer on fait tomber une quilles
		for (int i = 0; i < 20; i++) {
			game.roll(1);
		}
		assertEquals(20, game.score());
	}

	@Test
	void test4() {
		// on roll 10 fois et chaque lancer on fait tomber une quille
		// on roll 10 fois et chaque lancer on fait tomber 2 quilles
		for (int i = 0; i < 10; i++) {
			game.roll(1);
		}
		for (int i = 0; i < 10; i++) {
			game.roll(2);
		}
		assertEquals(30, game.score());

	}
	
	/*@Test 
	void test5() {
		// on roll 7 puis 3 on (2 lancee) et on fait tomber 10 quilles 
		// 
	}*/

}
