import java.util.Scanner;

public class practice8 {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    System.out.println("値を入力して下さい。");
    double x = stdIn.nextDouble();
    System.out.println("xの値:" + x);
    double y = stdIn.nextDouble();
    System.out.println("yの値:" + y);
    System.out.println("合計は" + (x + y) + "です。");
    System.out.println("平均は" + (x + y) / 2 + "です。");
   }
 }
