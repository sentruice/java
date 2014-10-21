import java.util.Scanner;

public class practice24 {
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("整数値を三つ入力して下さい。");
	int a = scan.nextInt();
	int b = scan.nextInt();
	int c = scan.nextInt();
	int min = a;
	if (b < min) min = b;
	if (c < min) min = c;
	System.out.println("最小値は" + min + "です。");
    }
}
