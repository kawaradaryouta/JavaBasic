/*
 * PTra13_09.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice13.ptra13;

import practice13.common.Employee;

public class PTra13_09 {

	/*
	 * ★ PTra13_08で作成したEmployeeクラスを使用します
	 */

	/** 名前データ（定数） */
	public static final String[] NAMEDATA = { "山田", "佐藤", "小林" };

	/** メールデータ（定数） */
	public static final String[] MAILDATA = { "yamada@hoge.com", "satou@hoge.com", "kobayashi@hoge.com" };

	/** パスワードデータ（定数） */
	public static final String[] PASSDATA = { "rezo0001", "rezo0002", "rezo0003" };

	/** 部署データ（定数） */
	public static final String[][] QUATERDATA = { { "総務部", "業務部", "システム部" }, { "5", "10", "35" }, };

	/**
	 * エントリーポイント
	 *
	 * @param args
	 */
	public static void main(String[] args) {

		// ★ 定数で定義されている各データを使用して、Employeeインスタンスを３つ作成してください
		Employee employee = new Employee();
		Employee employee2 = new Employee();
		Employee employee3 = new Employee();

		employee.userNm = NAMEDATA[0];
		employee.mail = MAILDATA[0];
		employee.password = PASSDATA[0];
		employee.setDepartmentNm(QUATERDATA[0][0]);

		employee.setDepartmentCnt(Integer.parseInt(QUATERDATA[1][0]));

		employee2.userNm = NAMEDATA[1];
		employee2.mail = MAILDATA[1];
		employee2.password = PASSDATA[1];
		employee2.setDepartmentNm(QUATERDATA[0][1]);

		employee2.setDepartmentCnt(Integer.parseInt(QUATERDATA[1][1]));

		employee3.userNm = NAMEDATA[2];
		employee3.mail = MAILDATA[2];
		employee3.password = PASSDATA[2];
		employee3.setDepartmentNm(QUATERDATA[0][2]);

		employee3.setDepartmentCnt(Integer.parseInt(QUATERDATA[1][2]));

		System.out.println("名前：" + employee.getUserNm());
		System.out.println("メールアドレス：" + employee.getMail());
		System.out.println("パスワード：" + employee.getPassword());
		System.out.println("部署：" + employee.getDepartmentNm());
		System.out.println("部署人数：" + employee.getDepartmentCnt());

		System.out.println("名前：" + employee2.getUserNm());
		System.out.println("メールアドレス：" + employee2.getMail());
		System.out.println("パスワード：" + employee2.getPassword());
		System.out.println("部署：" + employee2.getDepartmentNm());
		System.out.println("部署人数：" + employee2.getDepartmentCnt());

		System.out.println("名前：" + employee3.getUserNm());
		System.out.println("メールアドレス：" + employee3.getMail());
		System.out.println("パスワード：" + employee3.getPassword());
		System.out.println("部署：" + employee3.getDepartmentNm());
		System.out.println("部署人数：" + employee3.getDepartmentCnt());

	}
}かいけつ
