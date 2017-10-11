/*
 * Student.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice12.common;

/**
 * 受講生の情報を格納します
 * @author Rhizome
 *
 */
public class Student {
	/** 受講生ID */
	private int studentId;
	  public int getstudentId() {
	        return this.studentId;

	  }
	  public void setstudentId(int studentId) {
	        this.studentId = studentId;
	  }



	/** 受講生氏名 */
	private String studentName;
	public String getstudentName(){
        return this.studentName;

  }
  public void setstudentName(String studentName) {
        this.studentName = studentName;
  }
	/** 会社名 */
	private String companyName;
	public String companyName(){
        return this.companyName;

  }
  public void setcompanyName(String companyName) {
        this.companyName=companyName;
  }

	/** 教室名 */
	private String className;
	public String className(){
        return this.className;

  }
  public void setclassName(String className) {
        this.className=className;
  }

	/** メールアドレス */
	private String mail;
	public String mail(){
        return this.mail;

  }
  public void setmail(String mail) {
        this.mail=mail;
  }


	/** パスワード */
	private String password;
	public String password(){
        return this.password;

  }
  public void setpassword(String password) {
        this.password=password;
  }
}
