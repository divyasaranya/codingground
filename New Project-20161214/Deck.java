import java.util.*;

public class Deck {

public enum Pattern {CLUBS, DIAMONDS, HEARTS, SPADES};

public final int maxNumberOfCards = 52;

public final int maxNumberPerPerson = 13;

public ArrayList<Card> cards = new ArrayList<Card>();

public Deck(){
//System.out.print("im here");
}

public void populate() {
for (Pattern pattern : Pattern.values()){
    for(int i = 0; i< maxNumberPerPerson ; i++) {
    Card newCard = new Card(pattern.toString(), i+1);
    cards.add(newCard);
    }
}
}

public void printDeck() {
for(int j = 0; j< maxNumberOfCards ; j++) {
System.out.print(cards.get(j).getPattern()+cards.get(j).getPosition()+" ");
}

}

public void shuffle() {
int i=0;
        
for(i=0; i< maxNumberOfCards; i++){
			
int rand = new Random().nextInt(52-i)+i;
			
Card temp = this.cards.get(i);
			
this.cards.set(i, this.cards.get(rand));
			
this.cards.set(rand, temp);

}

}


}