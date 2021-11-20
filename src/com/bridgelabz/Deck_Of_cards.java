package com.bridgelabz;

import java.util.Random;

public class Deck_Of_cards {

	String[][] cards = new String[4][13];

	public void shuffle() {
		Random random = new Random();
		int num1, num2, num3, num4;
		String temp;
		for (int i = 0; i < 100; i++) {
			num1 = random.nextInt(4);
			num2 = random.nextInt(12);
			num3 = random.nextInt(4);
			num4 = random.nextInt(12);

			if (cards[num1][num2] != cards[num3][num4]) {
				temp = cards[num1][num2];
				cards[num1][num2] = cards[num3][num4];
				cards[num3][num4] = temp;
			}
		}
	}

	void display_Player_cards() {

		int n = 8;
		for (int i = 0; i < 4; i++) {
			System.out.print("Player " + (i + 1) + ": [ ");
			for (int j = 0; j < 8; j++) {

				System.out.print(cards[i][j] + " ,");
			}
			System.out.println(cards[i][n] + " ]");
		}
	}
}

	