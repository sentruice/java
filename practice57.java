import java.util.Scanner;
import java.util.Random;

public class practice57 {
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	Random rand = new Random();
	
	System.out.println("数当てゲーム開始！");
	int x = rand.nextInt(90) + 10;
	System.out.println("数字を5回以内に当てて下さい？");
	int y;
	int z = 4;
Loop:
	do {
	    y = scan.nextInt();
	    if (x > y && (x - y) <= 10) {
		System.out.println("少し小さい");
	    }
	    else if (x < y && (y - x) <= 10) {
		System.out.println("少し大きい");
	    }
	    else if (x > y) {
		System.out.println("小さい");
	    }
	    else if (x < y) {
		System.out.println("大きい");
	    }
	    if (z == 0) {
		break Loop;
	    }
	    else {
	    System.out.println("あと" + z + "回です。");
	    z--;
	    }
	} while (y != x);
	if(y == x) {
	    System.out.println("正解です。");
	}
	else {
	    System.out.println("正解は" + x + "です。");
	}
    }
}
