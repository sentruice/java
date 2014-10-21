import java.util.Random;
import java.util.Scanner;

public class practice6_14 {
    public static void main(String[] args) {
	Random rand = new Random();
	Scanner stdIn = new Scanner(System.in);
	String[] monthString = {
	    "January", "February", "March",     "April",   "May",      "June",
	    "July",    "August",   "September", "October", "November", "December"
	};

	System.out.println("英語の月名を入力してください。\nなお、先頭は大文字で、2文字目以降は小文字とします。");
	int again = 1;				// 繰り返しの判定フラグ
	int last = 0;				// 前回の問題月
	
	do {
	    int month = rand.nextInt(12);
	    if(last == month)
		continue;
	    while(true) {
		System.out.print(month + 1 + "月 : ");
		String input = stdIn.next();
		if(input.equals(monthString[month]))
		    break;
		System.out.println("違います。");
	    }
	    last = month;
	    System.out.print("正解です。もう一度？ 1…Yes/0…No : ");
	    again = stdIn.nextInt();
	} while(again != 0);
    
    }
}
