package com.task.model;

import java.util.List;
import java.util.Random;

/**
 * Representation of deck of cards
 */
public class DeckOfCards implements Shuffle {

    /** storage*/
    private List<CardModel> cards;

    public DeckOfCards(List<CardModel> cards) {
        this.cards = cards;
    }

    /**
     * Implements the Fisher–Yates shuffle algorithm
     */
    @Override
    public void shuffle() {
        int size = cards.size();
        Random random = new Random();

        for (int index = 0; index < size; ++index) {
            int randomIndex = (int) (random.nextDouble() * size);

            CardModel temp = cards.get(index);
            cards.set(index, cards.get(randomIndex));
            cards.set(randomIndex, temp);
        }
    }

    /**
     * Returns the first card in the deck if it exists
     * 
     * @throws DeckOfCardsException
     */
    public CardModel dealOneCard() throws DeckOfCardsException {
        CardModel result = null;
        if (cards.isEmpty()) {
            throw new DeckOfCardsException("The deck is empty. Cannot deal card.");
        } else {
            result = cards.get(0);
            cards.remove(0);
        }

        return result;
    }

    public void printDetails() {
        System.out.println("The set of cards in the deck:");
        for (CardModel card : cards) {
            card.printDetails();
        }
        System.out.println("######################################");
    }

    public List<CardModel> getCards() {
        return cards;
    }

    public void setCards(List<CardModel> cards) {
        this.cards = cards;
    }

}
