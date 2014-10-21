import java.util.Scanner;

public class practice55 {
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("整数を加算します。");
	System.out.print("何個加算しますか？:");
	int n = scan.nextInt();

	int sum = 0;
	for (int i = 0; i < n ; i++) {
	    System.out.print("加算したい個数分入力したら終了します。:");
	    int t = scan.nextInt();
	    if (i == n) break;
	    sum += t;
	}
	System.out.println("合計は" + sum + "です。");
	System.out.println("平均は" + (sum / n) + "です。");
    }
}
