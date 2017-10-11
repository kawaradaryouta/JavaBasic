package practice14.ptra14;

import practice14.common.Course;

public class DBCourse implements Course{

	public String getCourseName() {
		return PREFIX + "DB基礎";
	}

	/**
	 * コースの単元を取得します
	 * 例）プログラミングの書き方、式と演算子　など
	 * @return
	 */
	public String[] getCourseUnit(){
		String g[]=new String[3];
		g[0]="DB基礎";
		g[1]="SQL基礎";
		g[2]="正規化";
		g[3]="SQL応用";

		return g;

	}





}
