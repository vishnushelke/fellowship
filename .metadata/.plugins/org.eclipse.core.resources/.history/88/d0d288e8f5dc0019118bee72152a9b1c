package com.bridgelabz.oops;

import java.util.*;

import com.bridgelabz.utility.OopsUtility;

public class DeckOfCards {

	public static void main(String[] args) {
		Random rand = new Random();
		String[] suit = { "club ", "diamond ", "heart ", "spades " };
		//jack=11,queen=12,king=13,ace=14
		String[] rank = { "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14" };
		String[] deck = new String[52];
		int length = deck.length;
		int i = 0;
		
		//created Deck of cards
		while (length > i) {
			for (int l = 0; l < 4; l++) {
				for (int l2 = 0; l2 < 13; l2++) {
					deck[i] = suit[l] + rank[l2];
					i++;
				}

			}

		}

//		for (int l = 0; l < deck.length; l++) {
//			System.out.print(deck[l] + ",");
//		}
		
		//shuffled using random function
		for (int l = 0; l < deck.length; l++) {
			int randomNumber = rand.nextInt(52);
			deck[randomNumber] = deck[51 - randomNumber];
		}
//		for (int l = 0; l < deck.length; l++) {
//			System.out.print(deck[l] + ",");
//		}

		// giving each player 9 cards
		String[] player1 = new String[9];
		String[] player2 = new String[9];
		String[] player3 = new String[9];
		String[] player4 = new String[9];
		i = 0;
		for (int j = 0; j < 9; j++) {
			player1[j]=deck[j];
		}
		for (int j = 0; j < 9; j++) {
			player2[j]=deck[j+9];
		}
		for (int j = 0; j < 9; j++) {
			player3[j]=deck[j+18];
		}
		for (int j = 0; j < 9; j++) {
			player4[j]=deck[j+27];
		}
		
		//printing their cards before sorting
		System.out.println("cards of player1 are :");
		OopsUtility.showCards(player1);
		System.out.println();
		System.out.println("cards of player2 are :");
		OopsUtility.showCards(player2);
		System.out.println();
		System.out.println("cards of player3 are :");
		OopsUtility.showCards(player3);
		System.out.println();
		System.out.println("cards of player4 are :");
		OopsUtility.showCards(player4);
		System.out.println();
		
		//Sorting and showing cards of each player
		System.out.println("cards of player1 are after sorting are :");
		OopsUtility.sortCards(player1);
		OopsUtility.showCards(player1);
		System.out.println();
		System.out.println("cards of player2 are after sorting are :");
		OopsUtility.sortCards(player2);
		OopsUtility.showCards(player2);
		System.out.println();
		System.out.println("cards of player3 are after sorting are :");
		OopsUtility.sortCards(player3);
		OopsUtility.showCards(player3);
		System.out.println();
		System.out.println("cards of player4 are after sorting are :");
		OopsUtility.sortCards(player4);
		OopsUtility.showCards(player4);
		
		
	}

}
