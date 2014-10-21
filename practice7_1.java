import java.util.Scanner;

public class practice7_1 {
    static int sign0f(int n) {
	if (n > 0) {
	    return 1;
	}
	else if (n < 0) {
	    return -1;
	}
	else {
	    return 0;
	}
    }

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.print("整数値:");
	int x = scan.nextInt();
	int y = sign0f(x);
	System.out.println(y);
    }
}
