import java.util.Scanner;

public class practice6_13 {
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	System.out.print("要素数:");
	int n = scan.nextInt();
	int []a = new int[n];
	int []b = new int[n];

	for (int i = 0; i < n; i++) {
	    System.out.print("a[" + i + "] = ");
	    a[i] = scan.nextInt();
	}
	
	System.out.println("配列aを配列bに逆順にコピー。");
	for (int i = 0; i < n; i++) {
	    b[n - i - 1] = a[i];
	}

	for (int i = 0; i < n; i++) {
	    System.out.println("b[" + i + "] = " + b[i]);
	}
    }
}
