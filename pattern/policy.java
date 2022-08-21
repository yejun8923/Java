package pattern;

import java.util.ArrayList;

interface PaymentStrategy{
    void pay(int amount);
}

class KakaoCarStrategy implements PaymentStrategy {
    private String name;
    private String cardNumber;
    private String cvv;
    private String dateOfExpiry;

    public KakaoCarStrategy(String nm, String ccNum,String cvv,String ExpiryDate){
        this.name =nm;
        this.cardNumber = ccNum;
        this.cvv = cvv;
        this.dateOfExpiry = ExpiryDate;
    }

    @Override
    public void pay(int amount){
        System.out.println(amount+" paid using KakaoCard.");
    }
}

class LunaCardStrategy implements PaymentStrategy {
    private String emailId;
    private String password;

    public LunaCardStrategy(String email,String pwd){
        this.emailId = email;
        this.password = pwd;
    }

    @Override
    public void pay(int amount){
        System.out.println(amount + " paid using LunaCard.");
    }
}

class Item {
    private String name;
    private int price;
    public Item(String name, int cost){
        this.name = name;
        this.price = cost;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}

class ShoppingCart {
    ArrayList<Item> items;

    public ShoppingCart(){
        this.items = new ArrayList<>();
    }

    public void addItem(Item item){
        this.items.add(item);
    }

    public void removeItem(Item item){
        this.items.remove(item);
    }

    public int calculateTotal(){
        int sum = 0;
        for(Item item : items){
            sum += item.getPrice();
        }

        return sum;
    }

    public void pay(PaymentStrategy paymentMethod){
        int amount = calculateTotal();
        paymentMethod.pay(amount);
    }
}
public class policy {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Item A = new Item("kundoIA",100);
        Item B = new Item("kundoIB", 300);

        cart.addItem(A);
        cart.addItem(B);

        // pay by LunaCard
        cart.pay(new LunaCardStrategy("kundol@example.com","pukubababo"));

        //pay by KakaoCard
        cart.pay(new KakaoCarStrategy("Ju hongchul","123456789","123","12/01"));
    }
}
