package com.gl.deckofcard;

import java.util.Random;

public class Deck {
    String[] valuesCards = new String[]{"Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
    String[] suits = new String[]{"Hearts", "Diamonds", "Clubs", "Trump"};
    final static int size = 36;
    public Card[] deckArray;

    {
        shuttle();
    }

    public void shuttle() {
        deckArray = new Card[size];
        for (String suit : suits) {
            for (String valueCard : valuesCards
            ) {
                Card card = new Card();
                card.setValue(suit + " - " + valueCard);
                putCardRandomPlace(card);
            }
        }
    }


    private void putCardRandomPlace(Card card) {
        Random random = new Random();
        int anyPosiition = random.nextInt(size);
        if (deckArray[anyPosiition] != null) {
            anyPosiition = getFreePlace();
        }
        deckArray[anyPosiition] = card;
    }

    public Card getCard() {
        if (deckArray[0] == null) {
            System.out.println("No more card left");
            return null;
        }
        Card card = deckArray[0];
        Card[] tempDeck = new Card[deckArray.length - 1];
        for (int i = 0; i <= tempDeck.length - 1; i++) {
            tempDeck[i] = deckArray[i + 1];
        }
        deckArray = tempDeck;
        return card;
    }

    private int getFreePlace() {
        for (int i = 0; i <= deckArray.length; i++) {
            if (deckArray[i] == null) {
                return i;
            }
        }
        System.out.println("No free place");
        return -1;
    }

    public int getSize() {
        return deckArray.length;
    }
}
