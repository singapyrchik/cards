package com.task.model;

/**
 * Class for all exception situations with operations on deck of cards
 */
public class DeckOfCardsException extends Exception {

    private static final long serialVersionUID = 1L;

    public DeckOfCardsException(String message) {
        super(message);
    }
}
