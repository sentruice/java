import java.util.Scanner;

public class practice44 {
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int n;
	do {
	    System.out.println("正の整数値を入力して下さい。");
	    n = scan.nextInt();
	} while (n <= 0);
	int sum = 0;
	for (int i = 1; i <= n; i++) {
	    sum += i;
	    System.out.println(i);
	    if (i == n) {
		System.out.println("=");
	    }
	    else {
		System.out.println("+");
	    }
	}
	System.out.println(sum);
    }
}
