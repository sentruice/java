import java.util.Scanner;
public class practice7 {
public static void main(String[] args) {
Scanner stdIn = new Scanner(System.in);
System.out.println("整数値を入力して下さい。");
int a = stdIn.nextInt();
int b = a + 10;
System.out.println("10を加算した値は" + b + "です。");
int c = a - 10;
System.out.println("10を減算した値は" + c + "です。");
}
}
