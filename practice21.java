import java.util.Scanner;

public class practice21 {
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("実数値を二つ入力して下さい。");
	double a = scan.nextDouble();
	double b = scan.nextDouble();
	System.out.println("大きい方の値は" + (a > b ? a : b) + "です。");
    }
}
