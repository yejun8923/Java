package BlackJack;

import Shuffler.Card;

public class BlackjackCard extends Card {

    public BlackjackCard(int suitNumber, int rankNumber) {
        super(suitNumber, rankNumber);
    }

    public int getValue() {
        switch (rankNumber) {
            case 1:
                return 11;
            case 11:
            case 12:
            case 13:
                return 10;
            default:
                return rankNumber;
        }
    }

    public boolean isAce() {
        if (rankNumber==1) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return String.valueOf(rankNumber);
    }
}