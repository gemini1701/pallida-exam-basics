import java.util.ArrayList;

public class CandyShop {

    public static String CANDY;
    public static String LOLLIPOP;
    int sugarAmount;
    int sugarBuy;
    int moneyAmount;
    int moneyIncome;
    int candyPrice;
    String candyName;

    public CandyShop(int sugarAmount){
        this.sugarAmount = sugarAmount;

        Candies CANDY = new Candies("CANDY");

      ArrayList<CandyShop> candyShop = new ArrayList<>(sugarAmount);

    }

    public void createSweets(String candyName){

    }

    public void raise(int candyPrice){
        candyPrice+=1;
    }

    public void buySugar(int sugarBuy){
        sugarAmount+=sugarBuy;
    }


    public void sell(String candy, int moneyIncome) {
        moneyAmount+=moneyIncome;
    }
    }
}
