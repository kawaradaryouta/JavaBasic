/*
 * PTra18_04.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PTra18_04 {

	/*
	 * PTra19_02で作成したPlayerクラスを使用します
	 */

	public static void main(String[] args) throws Exception {

		/*
		 * ① ★ file/BestElevenCandidate.csvの内容を取得し、１行毎にPlayerインスタンスに情報を格納してください ★
		 * ArrayListを作成して、Playerインスタンスを格納してください
		 */
		ArrayList<Player> array = new ArrayList<>();
		try (Scanner scanner = new Scanner(new File("file/BestElevenCandidate.csv"))) {
			while (scanner.hasNext()) {
				Player player = new Player();
				String line = scanner.nextLine();
				String[] s = line.split(",", 0);

				player.setPosition(s[0]);
				player.setName(s[1]);
				player.setCountry(s[2]);
				player.setTeam(s[3]);
				array.add(player);

			}
		} catch (FileNotFoundException e) {
			System.out.println("ファイルが見つかりません");
		}

		// ★ ①のArrayListの中からGK1名、DF4名、MF4名, FW2名をランダムで出力してください

		Collections.shuffle(array);

		int GKCount = 0;
		int DFCount = 0;
		int MFCount=0;
		int FWCount=0;

		for (int i = array.size() - 1; i >= 0; i--) {
			Player player = array.get(i);

			if (player.getPosition().equals("GK")) {
				if (GKCount < 1) {

					System.out.println(player);
					GKCount += 1;
				}
			}
			if (player.getPosition().equals("DF")) {
				if (DFCount < 4) {
					System.out.println(player);
					DFCount += 1;
				}
			}
			if (player.getPosition().equals("MF")) {
				if (MFCount < 4) {
					System.out.println(player);
					MFCount += 1;
				}
			}
			if (player.getPosition().equals("FW")) {
				if (FWCount < 2) {
					System.out.println(player);
					FWCount += 1;

				}
			}
		}

	}
}
