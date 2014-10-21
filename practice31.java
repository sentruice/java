import java.util.Scanner;

public class practice31 {
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int rep;
	do {
	    System.out.println("整数値を入力して下さい。");
	    int x = scan.nextInt();
	    if (x > 0) {
		System.out.println("その値は正の値です。");
	    }
	    else if (x < 0) {
		System.out.println("その値は負の値です。");
	    }
	    else {
		System.out.println("その値は0です。");
	    }

	    System.out.println("もう一度入力しますか？ 1・・・Yes/0・・・No:");
	    rep = scan.nextInt();
	} while (rep == 1);
    }
}
