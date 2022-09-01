package BlackJack;

import Shuffler.Card;
import Shuffler.Deck;

public class BlackjackHand extends Deck {

    int sum =0;

    public int getValue(){
        int cnt=0;
        for (Card card : getCards()){
            if(Integer.parseInt(String.valueOf(card)) == 1){
                int boo = sum+11;
                if(boo > 21){
                    sum+= 1;
                }else sum += 11;
            }else {
                sum += Integer.parseInt(String.valueOf(card));
            }

            if(cnt == 0 ){
                if(sum+Integer.parseInt(String.valueOf(getCards().get(cnt+1))) > 21){
                    sum-=10;
                }
            }
            cnt++;
        }


        return sum;
    }

    public boolean isBusted(){

        return sum > 21;
    }

    public boolean isBlackjack(){

        return sum == 21 && getCards().size() == 2;
    }
}
