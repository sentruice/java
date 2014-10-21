import java.util.Scanner;

public class practice17 {
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("正の整数値を入力して下さい。");
	int x = scan.nextInt();
	if (x < 0) {
	    System.out.println("その値は負の値です。");
	}
	else if (x % 5 == 0) {
	    System.out.println("その値は5で割り切れます。");
	}
	else if (x % 5 != 0) {
	    System.out.println("その値は5で割り切れません。");
	}
    }
}
