package com.task.model.poker;

import com.task.model.CardModel;

/**
 * Representation of poker-style card
 */
public class PokerCard extends CardModel {

    private Suit suit;
    private FaceValue faceValue;

    public PokerCard(FaceValue faceValue, Suit suit) {
        this.faceValue = faceValue;
        this.suit = suit;
    }

    @Override
    public void printDetails() {
        System.out.println(faceValue + " of " + suit);
    }
}
