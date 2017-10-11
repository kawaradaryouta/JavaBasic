package practice14.ptra14;

import practice14.common.Course;

public class JavaCourse implements Course{

	public String getCourseName() {
		return PREFIX + "「Java」";
	}

	public String[] getCourseUnit(){
		String g[]=new String[6];
		g[0]="式と演算";
		g[1]="制御構文";
		g[2]="メソッド";
		g[3]="配列";
		g[4]="オブジェクト指向";
		g[5]="継承";
		g[6]="高度な継承";
		return g;
	}
}
