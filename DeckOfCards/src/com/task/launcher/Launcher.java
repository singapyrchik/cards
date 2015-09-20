package com.task.launcher;

import java.util.ArrayList;

import com.task.model.CardModel;
import com.task.model.DeckOfCards;
import com.task.model.DeckOfCardsException;
import com.task.model.poker.FaceValue;
import com.task.model.poker.PokerCard;
import com.task.model.poker.Suit;

public class Launcher {

    public static void main(String[] args) {
        /* creating the deck of poker cards */
        final int deckOfPokerCardsSize = 52;
        ArrayList<CardModel> cards = new ArrayList<CardModel>(deckOfPokerCardsSize);

        for (Suit suit : Suit.values()) {
            for (FaceValue faceValue : FaceValue.values()) {
                cards.add(new PokerCard(faceValue, suit));
            }
        }

        DeckOfCards deck = new DeckOfCards(cards);

        deck.printDetails();
        deck.shuffle();
        deck.printDetails();

        while (true) {
            try {
                CardModel temp = deck.dealOneCard();
                System.out.print("Dealt card: ");
                temp.printDetails();
            } catch (DeckOfCardsException e) {
                System.out.println(e.getMessage());
            }
        }
        /*
         * if necessary you can do any or another operations in the another
         * order
         */
    }
}
