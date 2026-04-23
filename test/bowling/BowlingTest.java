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

	@Test
	void test5() {
		// on roll 7 puis 3 on (2 lancee) et on fait tomber 10 quilles
		game.roll(7);
		game.roll(3);
		game.roll(4);
		for (int i = 0; i < 17; i++) {
			game.roll(0);
		}
		assertEquals(18, game.score());
	}

	@Test
	void test6() {
		// on roll 10 et on roll 3 puis on rolle 4
		// 19 lancees 
		game.roll(10);
		game.roll(3);
		game.roll(4);
		for (int i = 0; i <16; i++) {
			game.roll(0);
		}
		assertEquals(24, game.score());

	}
	/*void test7() {
		game.roll(1); //roll[0]=1
		game.roll(2);  //roll[1]=2
		
		game.roll(10); //roll[2]=10//ya pas de deuxieme lance
		
		game.roll(0); 
		game.roll(10);
		
		game.roll(4);
		game.roll(2);
		
		game.roll(0);
		game.roll(10);
		
		game.roll(6);
		game.roll(2);
		
		game.roll(0);
		game.roll(10);
		
		game.roll(6);
		game.roll(4);
		
		game.roll(8);
		game.roll(2);
		
		game.roll(2);
		game.roll(7);
		assertEquals(122,game.score());
		
	}*/

}
