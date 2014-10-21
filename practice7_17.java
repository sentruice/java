import java.util.Scanner;

public class practice7_17 {

    static int linerSearchR(int[] a, int key) {
	for (int i = a.length - 1; i >= 0; i--) {
	    if (a[i] == key) {
		return i;
	    }
	}
	return -1;
    }

    public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);

	System.out.print("要素数:");
	int n = scan.nextInt();
	int[] a = new int[n];
	for (int i = 0; i < a.length; i++) {
	    System.out.print("a[" + i + "] = ");
	    a[i] = scan.nextInt();
	}

	System.out.print("探す値:");
	int ky = scan.nextInt();
	int idx = linerSearchR(a, ky);
	if (idx == -1) {
	    System.out.println("その値は存在しません。");
	}
	else {
	    System.out.println("その値はa[" + idx + "]にあります。");
	}
    }
}
