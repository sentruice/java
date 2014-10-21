import java.util.Scanner;

public class practice46 {
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("何個*を表示しますか？");
	int n = scan.nextInt();
	for (int i = 0; i <= n; i++) {
	    System.out.println('*');
	    if (i % 5 == 0) {
		System.out.println('\n');
	    }
	}
    }
}
