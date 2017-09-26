package practice16;

public class Merchant {

	final int price=100;
	int stock=100;
	int money=0;
		// TODO 自動生成されたメソッド・スタブ

	    // お客様からお金を預かる
	 void sellItem(int x){
		this.stock=(stock-(x));
		this.money=(price*(x));
	 }
		String confirmMoney() {
			   return"「売上は"+this.money+"円です。」";
		 }


}
