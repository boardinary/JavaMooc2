import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Hand implements Comparable<Hand>{
    private List<Card> hand;
    
    public Hand() {
        hand = new ArrayList<>();
    }
    
    public void add(Card card) {
        hand.add(card);
    }
    
    public void print() {
        hand.stream().forEach(card -> System.out.println(card));
    }
    
    public void sort() {
        Collections.sort(hand);
    }
    
    public int getSum() {
        return this.hand.stream().mapToInt(h -> h.getValue()).sum();
    }
    
    @Override
    public int compareTo(Hand comparedHand) {
        return this.getSum() - comparedHand.getSum();
    }
    
    public void sortBySuit() {
        Collections.sort(hand, new BySuitInValueOrder());
    }
}
