package practice16;

public class Main {
    public static void main(String[] args) {
        Merchant merchant = new Merchant();
        merchant.sell(50);
        System.out.println(merchant.confirmMoney());
    }

}

