package week5;

public class Card {

	String name;
	String suit;
	int value;
	
	Card(String name, String suit, int value){//constructor, when called will:
		this.name = name;
		this.suit = suit;
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSuit() {
		return suit;
	}

	public void setSuit(String suit) {
		this.suit = suit;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	public void describe() {//will print out the values stored in above fields
		System.out.println(this.name + " of " + this.suit + " -- " + this.value);//"Ace of Spades -- (1-52?)
	}
}
