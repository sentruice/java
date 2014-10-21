import java.util.Scanner;

public class DayTester {
    public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	
	String[] wd = {"日", "月", "火", "水", "木", "金", "土"};
	
	System.out.print("年:");
	int year = scan.nextInt();
	System.out.print("月:");
	int month = scan.nextInt();
	System.out.print("日:");
	int date = scan.nextInt();

	Day birthday = new Day(year, month, date);

	System.out.println("あなたの誕生日は\n"
	 + birthday.getYear() + "年"
	 + birthday.getMonth() + "月"
	 + birthday.getDate() + "日"
	 + wd[birthday.dayOfWeek()] + "曜日です。");
    }
}
