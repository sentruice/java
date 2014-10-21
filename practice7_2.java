import java.util.Scanner;

public class practice7_2 {
    static int min (int a, int b, int c) {
	int min = a;
	if (min > b) {
	    min = b;
	}
	if (min > c) {
	    min = c;
	}
	return min;
    }
    
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("3つの整数値の最小値を求めます。");
	int x = scan.nextInt();
	int y = scan.nextInt();
	int z = scan.nextInt();

	System.out.println("最小値は" + min(x, y, z) + "です。");
    }

}
