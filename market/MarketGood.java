package market;

public class MarketGood {
    public final String name;
    public final int retailPrice; // final 로 바꿀시 private-> public 로 변경 가능 (getter / setter) 안써두 되어 코드가 짧아짐
    private int discountRate;

    public MarketGood(String name, int retailPrice, int discountRate){
        this.name = name;
        this.retailPrice = retailPrice;
        if(0 < discountRate && discountRate < 100){
            this.discountRate = discountRate;
        } else this.discountRate = 0;
    }

    public MarketGood(String name, int retailPrice){
        this.name = name;
        this.retailPrice = retailPrice;
        this.discountRate = 0;
    }

    public void setDiscountRate(int discountRate) {
        this.discountRate = discountRate;
    }

    public String getName() {
        return name;
    }

    public int getDiscountRate() {
        return (retailPrice * (100 - discountRate)) / 100;
    }

    public int Discount() {
        return discountRate;
    }

    public int getRetailPrice() {
        return retailPrice;
    }

}
