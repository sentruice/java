import java.util.Scanner;

public class practice48 {
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	System.out.println("整数値を入力して下さい。");
	int n = scan.nextInt();

	for (int i = 1; i <= n; i++) {
	    System.out.println(i + "の2乗は" + (i*i) + "です。");
	}
    }
}
