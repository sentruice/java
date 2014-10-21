import java.util.Scanner;

public class practice47 {
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	System.out.println("整数値:");
	int n = scan.nextInt();
	
	int count = 0;
	for (int i = 1; i <= n; i++) {
	    if (n % i == 0) {
	    System.out.println(i);
	    count++;
	    }
	}
	
	System.out.println("約数の個数は" + count + "です。");
    }
}
