package com.gl.deckofcard;

public class Main {

    public static void main(String[] args) {

        Deck deck =new Deck();
        String card = deck.getCard().getValue();
        String card1 = deck.getCard().getValue();
        System.out.println(card+"\n\r"+card1 );
        System.out.println(deck.getSize());
    }
}