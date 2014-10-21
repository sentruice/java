import java.util.Scanner;

public class practice34 {
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("正の整数値を入力して下さい。");
	int x;
	do {
	    x = scan.nextInt();
	} while (x <= 0);
	while (x >= 0) {
	    System.out.println(x);
	    x--;
	}
	System.out.println("ループ終了時の値が" + x + "です。");
    }
}
