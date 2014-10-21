import java.util.Scanner;

public class practice20 {
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("点数を入力して下さい");
	int x = scan.nextInt();
	if (x >= 0 && x <= 59) {
	    System.out.println("不可");
	}
	else if (x >= 60 && x <= 69) {
	    System.out.println("可");
	}
	else if (x >= 70 && x <= 79) {
	    System.out.println("良");
	}
	else if (x >= 80 && x <= 100) {
	    System.out.println("優");
	}
    }
}
