import java.util.Scanner;

public class practice54 {
    public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	System.out.println("整数値を入力して下さい。");
	int n = scan.nextInt();
	int i;
	for (i = 2; i < n ; i++) {
	    
	    if (n % i == 0) {
		System.out.println("素数ではありません。");
		break;
	    }
	}
	if (i == n) {
	    System.out.println("素数です。");
	}
    }
}
