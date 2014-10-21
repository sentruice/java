import java.util.Scanner;
public class practice9 {
public static void main(String[] args) {
Scanner stdIn = new Scanner(System.in);
System.out.println("三角形の面積を求めます。");
double b = stdIn.nextDouble();
System.out.println("底辺:" + b);
double h = stdIn.nextDouble();
System.out.println("高さ:" + h);
System.out.println("面積は" + (b + h) / 2 + "です。");
}
}
