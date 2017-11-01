package programexamples;

public class BlackJack {


public static void main(String[] args) {

	System.out.println(blackJack(21, 1));

}

static int blackJack(int card1, int card2) {

	if (card1 > 21 && card2 > 21) {
		return 0;

	}

	if (card1 <= 21 && card2 > 21) {
		return card1;

	}

	if (card2 <= 21 && card1 > 21) {
		return card2;

	} else {
		return Math.max(card1, card2);
	}

}

}