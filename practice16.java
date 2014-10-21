import java.util.Scanner;

public class practice16 {
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("整数A:");
	int a = scan.nextInt();
	System.out.println("整数B:");
	int b = scan.nextInt();
	if (a > b) {
	    System.out.println("Aの方が大きい。");
	}
	else if (a < b) {
	    System.out.println("Bの方が大きい。");
	}
	else {
	    System.out.println("AとBは同じ値。");
	}
    }
}
