package practice10;
/*
 * PTra10_06.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra10_06 {

	/*
	 * PTra10_05で作成したCarクラスを使用します
	 */

	public static void main(String[] args) {
		final int distance = 300;
		/*
		 * carインスタンスを3件作成し、それぞれの色、ガソリンを入力して決定してください
		 * 各carインスタンスのrunメソッドを実行して、それぞれ「目的地にまでn時間かかりました。残りのガソリンは、xリットルです」を出力してください。
		 */
		int num=0;
		int count=0;

		Car car1=new Car();
		car1.color="red";
		car1.gasoline=50;
		while(true) {
			num+=car1.run();
			count++;
			if(distance<=num) {

			System.out.println("目的地にまで"+count+"時間かかりました。残りのガソリンは、"+car1.gasoline+"リットルです");
			System.out.println(num);
			break;
			}
			Car car2=new Car();
			car2.color="blue";
			car2.gasoline=60;
			while(true) {
				num+=car2.run();
				count++;

				if(distance<=num) {
				System.out.println("目的地にまで"+count+"時間かかりました。残りのガソリンは、"+car2.gasoline+"リットルです");
				System.out.println(num);
				break;
				}
				Car car3=new Car();
				car3.color="green";
				car3.gasoline=70;

				while(true) {
					num+=car3.run();
					count++;
					car3.run();
					if(distance<=num) {
					System.out.println("目的地にまで"+count+"時間かかりました。残りのガソリンは、"+car3.gasoline+"リットルです");
					System.out.println(num);
					break;
				}
					}
			}
		}チェック
	}
}
