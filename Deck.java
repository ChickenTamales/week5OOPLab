package week5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {//in this class called Deck,

	List<Card> cards = new ArrayList<Card>();//there is a list of cards
	
	Deck(){//constructor
		String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};//
		String[] numbers = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
		for (String suit : suits) {//for each suit in the array 'suits'
			int count = 2;//count initialized at 2 
			for (String number : numbers) {//each number in the array 'numbers'
				Card card = new Card(number, suit, count);//a new card is created with a number, a suit, and a count
				this.cards.add(card);
				count++;//move to the next card
			}
			//this code will create the deck
		}
	}
	//source > generate getters and setters
	
	public List<Card> getCards() {
		return cards;
	}

	public void setCards(List<Card> cards) {
		this.cards = cards;
	}
	public void describe() {
		for (Card card : this.cards) {//for each card in this Array 'cards'
			card.describe();
		}
	}
	public void shuffle() {
		Collections.shuffle(this.cards);
	}
	public Card draw() {//doesn't need parameters because we're using the field in the deck class
		Card card = this.cards.remove(0);//this will take the card out of the deck and in the card variable
		return card;
		
	}
}
