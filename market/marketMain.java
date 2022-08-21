package market;

public class marketMain {
    public static void main(String[] args) {

        MarketGood g1 = new MarketGood("MacBook Air", 1250000);
        MarketGood g2 = new MarketGood("MacBook Pro", 2990000, 15);
        MarketGood g3 = new MarketGood("iPhone", 920000, 20);
        MarketGood g4 = new MarketGood("iPhone Pro 13", 1420000, 90);


        System.out.println(g1.getName()+"의 할인율: "+g1.Discount()+"%");
        System.out.println(g2.getName()+"의 할인율: "+g2.Discount()+"%");
        System.out.println(g3.name+"의 정상 가격: "+g3.retailPrice+"원");
        System.out.println(g3.name+"의 할인 가격: "+g3.getDiscountRate()+"원");
        g3.setDiscountRate(35);
        System.out.println("경쟁 업체가 많아져서 "+g3.getName()+"의 할인율이 "+g3.Discount()+"%로 올랐습니다.");
        System.out.println(g3.getName()+"의 할인 가격: "+g3.getDiscountRate()+"원");
        System.out.println(g4.getName()+"의 할인율: "+g4.Discount()+"%");
        System.out.println(g2.getName()+"의 할인 가격: "+g2.getDiscountRate()+"원");
    }
}
