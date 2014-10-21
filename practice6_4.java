import java.util.Random;
import java.util.Scanner;
public class practice6_4 {
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	Random rand = new Random();
	System.out.print("要素数:");
	int n = scan.nextInt();
	int x[] = new int[n];
	for (int i = 0; i < n; i++) {
	    x[i] = 1 + rand.nextInt(10);
	}
	for (int i = 10; i > 0; i--) {
	    for (int j = 0; j < n; j++) {
		if(x[j] >= i) {
		    System.out.print('*');
		}
		else {
		    System.out.print(' ');
		}
		if (j < n - 1) {
		    System.out.print(' ');
		}
		System.out.print('\n');
	    }
	}
	for (int i = 0; i < n * 2 - 1; i++) {
	    System.out.print('-');
	}
	System.out.print('\n');
	for (int i = 0; i < n; i++) {
	    System.out.print(i % 10);
	    if (i < n - 1)
		System.out.print(' ');
	}
	System.out.println('\n');
    }
}
