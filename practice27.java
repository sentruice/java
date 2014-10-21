import java.util.Scanner;

public class practice27 {
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("整数値を二つ入力して下さい。");
	int a = scan.nextInt();
	int b = scan.nextInt();
	if (a < b) {
	    int x = a;
	    a = b;
	    b = x;
	}
	System.out.println("大きい順にソートしました。");
	System.out.println(a);
	System.out.println(b);
    }
}
