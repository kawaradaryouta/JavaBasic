package practice16;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 */
public class PTra16_01 {
    public static void main(String[] args) {
    	Date date = new Date();
		SimpleDateFormat f = new SimpleDateFormat("YYYY年MM月dd日");
		String dateStr = f.format(date);
		System.out.println(dateStr);

        /*
        * ★ 現在日付を「YYYY年MM月DD日」形式で出力してください
        *  ※　他の標準クラスも使って良いです
        */

    }
}