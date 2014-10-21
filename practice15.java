import java.util.Scanner;

public class practice15 {
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("整数A:");
	int x = scan.nextInt();
	System.out.println("整数B:");
	int y = scan.nextInt();
	if ((x % y) == 0) {
	    System.out.println("BはAの約数です。");
	}
	    else {
		System.out.println("BはAの約数ではありません。");
	    }
    }
}
