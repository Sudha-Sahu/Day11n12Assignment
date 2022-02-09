package com.Bridgelabz.Day11n12Assignment;
import java.util.Random;

public class DeckOfCards{
	String[] club =     {  "CAce", "C2", "C3", "C4", "C5", "C6", "C7", "C8", "C9", "C10", "CJack", "CQueen", "CKing"};
	String[] diamond =	{ "DAce", "D2", "D3", "D4", "D5", "D6", "D7", "D8", "D9", "D10", "DJack", "DQueen", "DKing"}; 
	String[] heart =	{ "HAce", "H2", "H3", "H4", "H5", "H6", "H7", "H8", "H9", "H10", "HJack", "HQueen", "HKing"}; 
	String[] spade =	{ "SAce", "S2", "S3", "S4", "S5", "S6", "S7", "S8", "S9", "S10", "SJack", "SQueen", "SKing" };
	String[][] cards = {club,diamond,heart,spade}; 
	String[][] newDeck;

	public void shuffleCards() {
		newDeck = cards;
		for(int j=1;j<5;j++) {
			System.out.println("the player"+j +" gets this cards after shuffling : ");
			for(int i=1;i<10;i++) {
				displayPlayerCards();
			}
		}
	}
	public void displayPlayerCards() {
		Random r = new Random();
		int suit = r.nextInt(4);
		int rank = r.nextInt(13);
		if(newDeck[suit][rank] == null)
			shuffleCards();
		else
			System.out.println(newDeck[suit][rank]);
	}

	public static void main(String[] args) {

		System.out.println("Welcome to Deck Of Cards Program");
		DeckOfCards card = new DeckOfCards();
		card.shuffleCards();
	}
}
