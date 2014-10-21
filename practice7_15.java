import java.util.Scanner;

public class practice7_15 {

    static int sumOf(int [] a) {
	int sum = 0;
	for (int i = 0; i < a.length; i++)
	    sum += a[i];
	return sum;
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
	
	System.out.println("配列aの全要素の合計:" + sumOf(a));

    }
}
