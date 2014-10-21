import java.util.Scanner;

public class practice7_18 {
    static void aryRmv(int[] a, int idx) {
	for (int i = idx; i < a.length - 1; i++) {
	    a[i] = a[i + 1];
	}
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
	System.out.print("削除する要素:");
	int idx = scan.nextInt();

	aryRmv(a, idx);

	for(int i = 0; i < a.length; i++) {
	    System.out.println("a[" + i + "] = " + a[i]);
	}
    }
}
