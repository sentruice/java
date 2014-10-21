import java.util.Scanner;

public class practice39 {
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	int n;
	
	do {
	    System.out.println("1から入力された数字までの積を求めます。");
	    n = scan.nextInt();
	} while (n <= 0);
	
	int pro = 1;
	int i = 1;
	while (i <= n) {
	    pro *= i;
	    i++;
	}
	System.out.println("1から" + n + "までの積は" + pro + "です。");
    }
}
	
