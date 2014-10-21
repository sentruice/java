import java.util.Scanner;

public class practice7_5 {
    static void hello() {
	System.out.println("こんにちは。");
    }

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);

	System.out.print("名前:");
	String username = scan.next();

	System.out.print(username + "さん");
	hello();
    }

}
