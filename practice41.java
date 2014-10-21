import java.util.Scanner;

public class practice41 {
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int n;
	do {
	    System.out.println("正の整数値を入力して下さい。");
	    n = scan.nextInt();
	} while (n <= 0);
	for (int i = 0; i < n; n--) {
	    System.out.println(n);
	}
    }
}
