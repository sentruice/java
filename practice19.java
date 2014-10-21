import java.util.Scanner;

public class practice19 {
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("正の整数値を入力して下さい。");
	int x = scan.nextInt();
	if (x < 0) {
	    System.out.println("その値は負の値です。");
	}
	else if (x % 3 == 0) {
	    System.out.println("その値は3で割り切れます。");
	}
	else if (x % 3 == 1) {
	    System.out.println("その値を3で割った余りは1です。");
	}
	else if (x % 3 == 2) {
	    System.out.println("その値を3で割った余りは2です。");
	}
    }
}
