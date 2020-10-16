package com.digiposte.kata;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class PokerHandTest {

  Main comparer(Main main1, Main main2){
    return main1;
  }

  class Main{

    public Main(int i, int i1, int i2, int i3, int i4) {

    }
  }
  /*
   * High Card: Hands which do not fit any higher category are ranked by the value of their highest card. If the highest cards have the same value, the hands are ranked by the next highest, and so on.
   * Pair: 2 of the 5 cards in the hand have the same value. Hands which both contain a pair are ranked by the value of the cards forming the pair. If these values are the same, the hands are ranked by the values of the cards not forming the pair, in decreasing order.
   * Two Pairs: The hand contains 2 different pairs. Hands which both contain 2 pairs are ranked by the value of their highest pair. Hands with the same highest pair are ranked by the value of their other pair. If these values are the same the hands are ranked by the value of the remaining card.
   * Three of a Kind: Three of the cards in the hand have the same value. Hands which both contain three of a kind are ranked by the value of the 3 cards.
   * Straight: Hand contains 5 cards with consecutive values. Hands which both contain a straight are ranked by their highest card.
   * Flush: Hand contains 5 cards of the same suit. Hands which are both flushes are ranked using the rules for High Card.
   * Full House: 3 cards of the same value, with the remaining 2 cards forming a pair. Ranked by the value of the 3 cards.
   * Four of a kind: 4 cards with the same value. Ranked by the value of the 4 cards.
   * Straight flush: 5 cards of the same suit with consecutive values. Ranked by the highest card in the hand.
   */
  @Test
  public void test() {
    Main main1 = new Main(1, 2, 3, 4, 5);
    Main main2 = new Main(1, 2, 3, 4, 4);
    Assertions.assertThat(comparer(main1, main2)).isSameAs(main1);
  }
}
