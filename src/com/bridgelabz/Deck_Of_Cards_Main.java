package com.bridgelabz;

public class Deck_Of_Cards_Main {
	
	public static void main(String[] args) {
		String[] suit = { "Clubs", "Diamonds", "Hearts", "Spades" };
		String[] rank = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };
		
		Deck_Of_cards deck_Of_cards = new Deck_Of_cards();
		
		for (int i = 0; i < suit.length; i++) {
			for (int j = 0; j < rank.length; j++) {
				deck_Of_cards.cards[i][j] = suit[i] + rank[j];
			}
		}
		deck_Of_cards.shuffle();
		deck_Of_cards.display_Player_cards();
	}


}
