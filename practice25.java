import java.util.Scanner;

public class practice25 {
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("整数値を三つ入力して下さい。");
	int a = scan.nextInt();
	int b = scan.nextInt();
	int c = scan.nextInt();
	int med = a;
	if (a < b && a > c) med = a;
	if (b < a && c < b) med = b;
	if (c < a && b < c) med = c;
	System.out.println("中央値は" + med + "です。");
    }
}
