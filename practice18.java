import java.util.Scanner;

public class practice18 {
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("正の整数値を入力して下さい。");
	int x = scan.nextInt();
	if (x < 0) {
	    System.out.println("その値は負の値です。");
	}
	else if (x % 10 == 0) {
	    System.out.println("その値は10で割り切れます。");
	}
	else if (x % 10 != 0) {
	    System.out.println("その値は10で割り切れません。");
	}
    }
}
