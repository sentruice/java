import java.util.Scanner;

public class practice7_3 {
    static int sumUp(int n) {
	int sum = 0;
	for (int i = 1; i <= n; i++) {
	    sum += i;
	}
	return sum;
    }

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	System.out.println("1から入力された値まで加算します。\nいくつまで加算しますか？");
	int x = scan.nextInt();
	
	System.out.println("1から" + x + "までの和は" + sumUp(x) + "です。");
    }

}
