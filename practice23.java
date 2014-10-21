import java.util.Scanner;

public class practice23 {
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("整数値を二つ入力して下さい。");
	int a = scan.nextInt();
	int b = scan.nextInt();
	if (a > b && (a - b) < 10) {
	    System.out.println("それらの差は10以下です。");
	}
	else if (a < b && (b - a) < 10) {
	    System.out.println("それらの差は10以下です。");
	}
	else {
	    System.out.println("それらの差は11以上です。");
	}
    }
}
