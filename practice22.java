import java.util.Scanner;

public class practice22 {
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("整数値を二つ入力して下さい。");
	int a = scan.nextInt();
	int b = scan.nextInt();
	if (a >= b) {
	    System.out.println("それらの差は" + (a - b) + "です。");
	}
	else {
	    System.out.println("それらの差は" + (b - a) + "です。");
	}
    }
}
