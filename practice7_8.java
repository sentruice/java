import java.util.Scanner;
import java.util.Random;

public class practice7_8 {
    static int random(int a, int b) {
	if (a >= b) {
	    return a;
	}
	Random rand = new Random();
	int x;
	if (b < 0) {
	    x = rand.nextInt(-a + b) + a;
	    return x;
	}
	else {
	    x = rand.nextInt(b - a) + a;
	    return x;
	}
    }
    
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	System.out.println("a以上b未満の値をランダムに返します。");
	System.out.print("整数a:");
	int a = scan.nextInt();
	System.out.print("整数b:");
	int b = scan.nextInt();
	
	int ran = random(a, b);
	
	System.out.println("結果:" + ran);
    }
}
