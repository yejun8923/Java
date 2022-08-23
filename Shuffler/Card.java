package Shuffler;

public class Card {
    private int suitNumber; // 카드 모양은 1-Clubs, 2-Hearts, 3-Diamonds, 4-Spades로 받음
    private int rankNumber; // 카드의 값을 뜻함 1부터 13까지 할당 1 = 'Ace' / 11 = 'Jack' / 12 = 'Queen' / 13 = 'King'

    public Card(int rankNumber, int suitNumber){
        this.suitNumber = suitNumber;
        this.rankNumber = rankNumber;

    }

    public String getSuit() {

        String suitString = null;

        if(suitNumber == 1) suitString = "Clubs";
        else if(suitNumber == 2) suitString = "Hearts";
        else if(suitNumber == 3) suitString = "Diamonds";
        else if(suitNumber == 4) suitString = "Spades";

        /*
        switch (suitNumber) {
            case 1:
                return "Clubs";
            case 2:
                return "Hearts";
            case 3:
                return "Diamonds";
            case 4:
                return "Spades";
            default:
                return "";
        }
         */

        return suitString;
    }

    String rankString = null;
    public String getRank(){

        String rankString = null;

        if(rankNumber == 1) rankString = "Ace";
        else if(rankNumber == 11) rankString = "Jack";
        else if(rankNumber == 12) rankString = "Queen";
        else if(rankNumber == 13) rankString = "King";
        if(rankString == null){
            return  String.valueOf(rankNumber);
        }

        /*
           switch (rankNumber) {
            case 1:
                return "Ace";
            case 2:
                return "Jack";
            case 3:
                return "Queen";
            case 4:
                return "King";
            default:
                return String.valueOf(rankNumber);
        }
         */

        return rankString;
    }

    @Override
    public String toString(){
        return "{" + getRank() + "} of {" + getSuit() + "}";
    }
}
