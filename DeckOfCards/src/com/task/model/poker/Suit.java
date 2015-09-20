package com.task.model.poker;

/**
 * Representation of poker cards suits
 */
public enum Suit {
    HEARTS {
        @Override
        public String toString() {
            return "hearts";
        }
    },
    SPADES {
        @Override
        public String toString() {
            return "spades";
        }
    },
    CLUBS {
        @Override
        public String toString() {
            return "clubs";
        }
    },
    DIAMONTS {
        @Override
        public String toString() {
            return "diamonts";
        }
    }
}
