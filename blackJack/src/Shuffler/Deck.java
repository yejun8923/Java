package Shuffler;

import java.util.ArrayList;
import java.util.Random;

public class Deck {
    private ArrayList<Card> cards;  // 덱에 있는 카드를 보관하는 arrayList

    public Deck() {
        cards = new ArrayList<>();
    }

    public ArrayList<Card> getCards(){  // 카드 목록 리턴
        return cards;
    }

    public void addCard(Card card){ // 파라미터로 card를 받고 cards에 추가
        cards.add(card);
    }

    public void print() {  // 카드 목록에 있는  모든 카드를 출력 출력할 때는  카드 인스턴스의  toString 메소드를 사용할 것
        for (Card card : cards){
            System.out.println(card);
        }
    }

    public void shuffle() { // cards의 카드를  뒤죽박죽 섞음 random클래스를 이용해서 완전히 섞어줄것
        Random random = new Random();

        for(int i=0; i<cards.size(); i++){
            int randomIndex = random.nextInt(cards.size());
            Card temp = cards.get(i);
            cards.set(i,cards.get(randomIndex));
            cards.set(randomIndex,temp);
        }
    }

    public Deck deal(int count){ // 먼저 hand라는 새로운 deck 인스턴스를 생성 count 5면 현재 덱의 마지막 다섯장을 빼고. 그 다섯장을 hand의 cards에 넣어줌 그리고 hand를 리턴함
        Deck hand = new Deck();

        for(int i=0; i<count; i++){
            hand.addCard(cards.remove(0));
        }

        return hand;
    }
}
