import java.util.Scanner;

public class practice7_16 {
    static int minOf(int[] a) {
	int min = a[0];
	for (int i = 0; i < a.length; i++) {
	    if (a[i] < min) {
		min = a[i];
	    }
	}
	return min;
    }
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.print("要素数:");
	int n = scan.nextInt();
	int[] a = new int[n];
	for (int i = 0; i < n; i++) {
	    System.out.print("a[" + i + "] = ");
	    a[i] = scan.nextInt();
	}
	System.out.println("配列aの要素の最小値は" + minOf(a) + "です。");
    }
}
