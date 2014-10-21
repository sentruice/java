import java.util.Random;
import java.util.Scanner;

public class practice32 {
    public static void main(String[] args) {
	Random rand = new Random();
	Scanner scan = new Scanner(System.in);
	int n = rand.nextInt(89) + 10;
	int x;
	do {
	    System.out.println("数当てゲーム開始！");
	    x = scan.nextInt();
	    if (x > n && (x - n) <= 10) {
		System.out.println("もうちょい小さい");
	    }
	    else if (x < n && (n - x) <= 10) {
		System.out.println("もうちょい大きい");
	    }
	    else if (x < n) {
		System.out.println("もっと大きい値");
	    }
	    else if (x > n) {
		System.out.println("もっと小さい");
	    }
	} while (x != n);
	System.out.println("正解！");
    }
}
