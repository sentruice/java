import java.util.Scanner;

public class practice14 {
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("整数値を入力して下さい。");
	int x = scan.nextInt();
	if (x < 0) 
	    x = -x;
	    System.out.println("絶対値は" + x + "です。");
    }
}
