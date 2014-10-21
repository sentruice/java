import java.util.Scanner;

public class practice13 {
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("名字を入力して下さい。");
	String s = scan.next();
	System.out.println("名前を入力して下さい。");
	String n = scan.next();
	System.out.println("こんにちわ" + s + n + "さん。");
    }

}
