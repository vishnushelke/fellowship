package com.bridgelabz.oops;

import java.util.*;

public class DeckOfCards {

	public static void main(String[] args) {
		Random rand = new Random();
		String[] suit = { "club ", "diamond ", "heart ", "spades " };
		String[] rank = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king", "ace" };
		String[] deck = new String[52];
		int length = deck.length;
		int i=0;
		while (length > i) {
			for (int l = 0; l < 4; l++) {
				for (int l2 = 0; l2 < 13; l2++) {
					deck[i] = suit[l] + rank[l2];
					i++;
				}

			}

		}

//		for (int l = 0; l < deck.length; l++) {
//			System.out.print(deck[l] + " ");
//		}
		for (int l = 0; l < deck.length; l++) {
			int randomNumber=rand.nextInt(52);
			deck[randomNumber]=deck[51-randomNumber];
		}
		for (int l = 0; l < deck.length; l++) {
			System.out.print(deck[l] + " ");
		}
		
		//giving each player 9 cards
	}

}
