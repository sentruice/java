import java.util.Scanner;

import java.util.Random;

public class practice11 {
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	Random rand = new Random();
	System.out.println("入力された整数値から5の範囲の値の乱数");
	int x = scan.nextInt();
	int y = rand.nextInt(11) - 5 + x;
	System.out.println(y);
	}

}
