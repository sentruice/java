import java.util.Scanner;

public class practice33 {
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("整数値を二つ入力して下さい。");
	int a = scan.nextInt();
	int b = scan.nextInt();
	int st, ed;
	if (a < b) {
	    st = a;
	    ed = b;
	}
	else {
	    st = b;
	    ed = a;
	}
	int x = st;
	do {
	    System.out.println(x++);
	    System.out.println(" ");
	} while(x < ed);
	System.out.println(x);
    }
}
