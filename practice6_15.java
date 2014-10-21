import java.util.Random;
import java.util.Scanner;

public class practice6_15 {
    public static void main(String[] args) {
	Random rand = new Random();
	Scanner stdIn = new Scanner(System.in);
	String[] weekdayStringJa = {
	    "日曜日", "月曜日", "火曜日", "水曜日", "木曜日", "金曜日", "土曜日"
	};
	String[] weekdayStringEn = {
	    "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"
	};

	System.out.println("英語の曜日を入力してください。\nなお、先頭は大文字で、2文字目以降は小文字とします。");
	int again = 1;				// 繰り返しの判定フラグ
	int last = 0;				// 前回の問題曜日
	do {
	    int weekday = rand.nextInt(7);
	    if(last == weekday)
		continue;
	    while(true) {
		System.out.print(weekdayStringJa[weekday] + " : ");
		String input = stdIn.next();
		if(input.equals(weekdayStringEn[weekday]))
		    break;
		System.out.println("違います。");
	    }
	    last = weekday;
	    System.out.print("正解です。もう一度？ 1…Yes/0…No : ");
	    again = stdIn.nextInt();
	} while(again != 0);
    }
}
