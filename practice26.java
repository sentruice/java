import java.util.Scanner;

public class practice26 {
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("整数値を二つ入力して下さい。");
	int a = scan.nextInt();
	int b = scan.nextInt();
	if (a > b) {
	    System.out.println("大きい方の値は" + a + "です。");
	    System.out.println("小さい方の値は" + b + "です。");
	}
	else if (a < b) {
	    System.out.println("大きい方の値は" + b + "です。");
	    System.out.println("小さい方の値は" + a + "です。");
	}
	else {
	    System.out.println("二つの値は同じです。");
	}
    }
}

