package com.task.model.poker;

/**
 * Representation of poker cards face values
 */
public enum FaceValue {
    TWO {
        @Override
        public String toString() {
            return "2";
        }
    },
    THREE {
        @Override
        public String toString() {
            return "3";
        }
    },
    FOUR {
        @Override
        public String toString() {
            return "4";
        }
    },
    FIVE {
        @Override
        public String toString() {
            return "5";
        }
    },
    SIX {
        @Override
        public String toString() {
            return "6";
        }
    },
    SEVEN {
        @Override
        public String toString() {
            return "7";
        }
    },
    EIGHT {
        @Override
        public String toString() {
            return "8";
        }
    },
    NINE {
        @Override
        public String toString() {
            return "9";
        }
    },
    TEN {
        @Override
        public String toString() {
            return "10";
        }
    },
    JACK {
        @Override
        public String toString() {
            return "jack";
        }
    },
    QUEEN {
        @Override
        public String toString() {
            return "queen";
        }
    },
    KING {
        @Override
        public String toString() {
            return "king";
        }
    },
    ACE {
        @Override
        public String toString() {
            return "ace";
        }
    }
}
