import java.util.Scanner;

public class practice38 {
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	int n;
	
	do {
	    System.out.println("正の整数値を入力して下さい。");
	    n = scan.nextInt();
	} while (n <= 0);
	
	int i = 0;
	
	while (n > 0) {
	    n /= 10;
	    i++;
	}
	System.out.println("その値は" + i + "桁です。");
    }
}
