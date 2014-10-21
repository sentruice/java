import java.util.Scanner;

public class practice28 {
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("整数値を二つ入力して下さい。");
	int a = scan.nextInt();
	int b = scan.nextInt();
	int c = scan.nextInt();
	if (a > b) {
	    int x = a;
	    a = b;
	    b = x;
	}
	if (a > c) {
	    int x = a;
	    a = c;
	    c = x;
	}
	if (b > c) {
	    int x = b;
	    b = c;
	    c = x;
	}
	System.out.println("小さい順にソートしました。");
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
    }
}
